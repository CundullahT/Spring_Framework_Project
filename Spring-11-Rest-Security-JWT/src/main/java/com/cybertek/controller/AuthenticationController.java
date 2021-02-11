package com.cybertek.controller;

import com.cybertek.annotation.DefaultExceptionMessage;
import com.cybertek.entity.AuthenticationRequest;
import com.cybertek.entity.ResponseWrapper;
import com.cybertek.entity.User;
import com.cybertek.exception.ServiceException;
import com.cybertek.service.UserService;
import com.cybertek.util.JWTUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JWTUtil jwtUtil;

    public AuthenticationController(UserService userService, AuthenticationManager authenticationManager, JWTUtil jwtUtil) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/authenticate")
    @DefaultExceptionMessage(defaultMessage = "Bad Credentials!")
    public ResponseEntity<ResponseWrapper> doLogin(@RequestBody AuthenticationRequest authenticationRequest){

        String password = authenticationRequest.getPassword();
        String username = authenticationRequest.getUsername();

        User foundedUser = userService.readByUsername(username);

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        authenticationManager.authenticate(authenticationToken);

        String jwtToken = jwtUtil.generateToken(foundedUser);

        return ResponseEntity.ok(new ResponseWrapper("Login Successful!", jwtToken));

    }

    @PostMapping("/create-user")
    public ResponseEntity<ResponseWrapper> createAccount(@RequestBody User user) throws ServiceException {

        User createdUser = userService.createUser(user);

        return ResponseEntity.ok(new ResponseWrapper("User has been created successfully", createdUser));

    }

}
