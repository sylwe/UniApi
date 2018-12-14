package com.swlodyga.pgsSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControll {

    @RequestMapping("/rest/hello")
    public String index() {
        return "You are in !";
    }

}
