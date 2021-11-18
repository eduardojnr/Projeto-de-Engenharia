package com.sceapp.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JWTAutenticarFilter extends UsernamePasswordAuthenticationFilter{

	private final AuthenticationManager authenticationManager;

	public JWTAutenticarFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

    
}
