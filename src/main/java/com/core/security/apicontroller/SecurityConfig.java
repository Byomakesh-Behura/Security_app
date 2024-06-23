package com.core.security.apicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
	
	//@Autowired
	//private UserDetailsService userDetailsService;
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		UserDetails normalUser = User.withDefaultPasswordEncoder()
				 .username("kumar")
                 .password("kumar")
                 .roles("GUEST")
                 .build();

        UserDetails adminUser = User.withDefaultPasswordEncoder()
        		.username("liku")
                .password("liku")
                .roles("ADMIN")
                .build();
		
		return new InMemoryUserDetailsManager(normalUser, adminUser);
	}

}
