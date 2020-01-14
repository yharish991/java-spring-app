package application.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http
             .authorizeRequests()
             .antMatchers("/login**", "/user", "/userInfo").authenticated()
             .and().logout().logoutSuccessUrl("/")
             .permitAll()
             .and()
             .oauth2Login();
    }

}
