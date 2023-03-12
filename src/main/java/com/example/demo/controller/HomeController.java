package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String home(){
        logger.trace("trace level home method accessed ");
        logger.info("this is info logging from Album Controller");
        return "Hello World";
    }

}
