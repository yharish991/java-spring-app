package application.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class Example {

    @RequestMapping("/user")
    public Principal user(@AuthenticationPrincipal Principal principal) {
        // Principal holds the logged in user information.
        // Spring automatically populates this principal object after login.
        return principal;
    }

    @RequestMapping("/userInfo")
    public String userInfo(@AuthenticationPrincipal Principal principal) {
        return String.valueOf(principal);
    }


}
