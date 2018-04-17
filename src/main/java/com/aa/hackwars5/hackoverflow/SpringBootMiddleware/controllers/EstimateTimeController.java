package com.aa.hackwars5.hackoverflow.SpringBootMiddleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstimateTimeController {

    @GetMapping("/test")
    public String test(){
        return "Hello";
    }

    @GetMapping("/estimate")
    public String estimate (
            @RequestParam String flightNumber,
            @RequestParam String uber,
            @RequestParam String checkInBags,
            @RequestParam String boardingPass
    ) {
        System.out.println(flightNumber);
        System.out.println(uber);
        System.out.println(checkInBags);
        System.out.println(boardingPass);

        return "7:10PM";
    }
}