package com.test.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean //it create bean and push into privateEncoder in userController layer
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {    ///login/* -> it tell anything under login folder
		http
		.authorizeRequests()
		.antMatchers("/showReg","/","/index.html","/registerUser","/login","/showLogin","/login/*").permitAll()
		.antMatchers("/addFlight").hasAnyAuthority("ADMIN")
		.anyRequest()
		.authenticated()
		.and().csrf().disable().logout()
		.logoutUrl("/perform_logout")
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID");
	}
	
	@Override
	@Bean  //this method generate token after login which is use to communicate with server.when it logout token is destroy 
	public AuthenticationManager authenticationManagerBean() throws Exception {
		
		return super.authenticationManager(); 
	}
	
}
