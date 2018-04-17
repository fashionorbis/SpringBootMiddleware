package com.aa.hackwars5.hackoverflow.SpringBootMiddleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.aa.hackwars5.hackoverflow.SpringBootMiddleware.dto.Response;

@RestController
public class EstimateTimeController {

    @GetMapping("/test")
    public String test(){
        return "Hello";
    }

    @GetMapping("/estimate")
    @ResponseBody
    public Response estimate (

            @RequestParam(required = false) String flightNumber,
            @RequestParam(required = false) String uber,
            @RequestParam(required = false) String checkInBags,
            @RequestParam(required = false) String boardingPass
    ) {
        System.out.println(flightNumber);
        System.out.println(uber);
        System.out.println(checkInBags);
        System.out.println(boardingPass);

        return new Response("Good to leave at 7:10PM","Good to leave at 7:10PM", "Middleware");
    }
}