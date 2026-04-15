package com.cesde.cityscooterapp.infrastructure.in.controllers;


import com.cesde.cityscooterapp.application.inputport.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @Autowired
    private  HelloWorldService helloWorldService;

    @GetMapping("/helloworld")
    public String createGreetings(){

        return helloWorldService.createSalute();

    }



}
