package com.apihomeworld.homeworld.Security.service;

import com.apihomeworld.homeworld.Security.dao.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

    private UserRepository userRepository;


    public JwtAuthorizationFilter(AuthenticationManager authenticationManager, AuthenticationEntryPoint authenticationEntryPoint, UserRepository userRepository) {
        super(authenticationManager, authenticationEntryPoint);
        this.userRepository=userRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        //Read the authorization header, where the jwt token should be
        String header = request.getHeader(JwtProperties.HEADER_STRING);
        
    }

}
