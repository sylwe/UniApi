package com.swlodyga.pgsSpringBoot.controller;

import com.swlodyga.pgsSpringBoot.model.JwtUser;
import com.swlodyga.pgsSpringBoot.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public Object generate(@RequestBody final JwtUser jwtUser){
        return jwtGenerator.generate(jwtUser);
    }
}
