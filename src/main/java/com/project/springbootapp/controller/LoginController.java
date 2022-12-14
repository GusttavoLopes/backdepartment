package com.project.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.springbootapp.security.Login;


import com.project.springbootapp.security.JwtUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private AuthenticationManager authManager;
    
    
    @PostMapping(path = "/login")
    public Login login(@RequestBody Login login) 
            throws JsonProcessingException {
        Authentication auth = new UsernamePasswordAuthenticationToken(login.getNome(), login.getSenha());
        auth = authManager.authenticate(auth);
        login.setSenha(null);
        login.setToken(JwtUtils.generateToken(auth));
        login.setAutorizacao(auth.getAuthorities().iterator().next().getAuthority());

        return login;
    }
    
}
