package com.swlodyga.pgsSpringBoot.security;

import com.swlodyga.pgsSpringBoot.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.swlodyga.pgsSpringBoot.repository.UserRepository;

@Component
public class JwtGenerator {

    @Autowired
    private UserRepository userRepository;
    String name;

    public Object  generate(JwtUser jwtUser) {

        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId", String.valueOf(jwtUser.getId()));
        claims.put("role", jwtUser.getRole());

//        String _name = claims.getSubject();

//        String _id = (String) claims.get(jwtUser.getUserName());

//        if (_name.equals(userRepository.findById(name))){
//            _name = "poprawny login";
//        }

                return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "tajnehaslo10")
                .compact();
//        return claims;
//        return _name;
    }
}
