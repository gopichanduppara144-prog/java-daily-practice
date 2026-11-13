package com.mawa.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Mawa! Spring Boot Start Ayindhi!";
    }

    @GetMapping("/mawa")
    public String mawa(){
        return "Mawa, Nuvvu Super! Job Kottabothunnav!";
    }
}