package com.atstudy.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @ResponseBody
    @GetMapping("/demo")
    public String hello(){

        logger.info(" ===>> hello.hello() ... ");

        return "hello spring boot ...";
    }


}
