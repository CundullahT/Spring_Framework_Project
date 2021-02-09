package com.cybertek.util;

import com.cybertek.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtil {

    @Value("${security.jwt.secret-key}")
    private String secret;

    public String generateToken(User user, String username){

        Map<String, Object> claims = new HashMap<>();

        claims.put("username", user.getUsername());
        claims.put("email", user.getEmail());

        return createToken(claims, username);

    }

    private String createToken(Map<String, Object> claims, String username){

        return Jwts
                .builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))    //  10 hours token validity.
                .signWith(SignatureAlgorithm.HS256, secret).compact();

    }

}
