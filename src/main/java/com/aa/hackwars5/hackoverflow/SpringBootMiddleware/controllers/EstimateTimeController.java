package com.aa.hackwars5.hackoverflow.SpringBootMiddleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstimateTimeController {

    @GetMapping("/test")
    public String test(){
        return "Hello";
    }
}