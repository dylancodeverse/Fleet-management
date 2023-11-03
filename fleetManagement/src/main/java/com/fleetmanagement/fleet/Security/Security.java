package com.fleetmanagement.fleet.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security {
    
    @Bean
    public SecurityFilterChain filterChain ( HttpSecurity http) throws Exception
    {
         http
        .authorizeHttpRequests(
           auth -> {
                    //    auth.requestMatchers("/admin").hasRole("ADMIN");
                    //    auth.requestMatchers("/usera").hasRole("USER");
                    auth.anyRequest().permitAll();

                   }
           ) ;
        
        return http.build() ;
            
        
    }


    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder ()
    {
        return new BCryptPasswordEncoder() ;
    }
}
