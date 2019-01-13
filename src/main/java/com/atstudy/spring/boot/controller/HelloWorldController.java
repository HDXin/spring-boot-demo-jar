package com.atstudy.spring.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.atstudy.spring.boot.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Person person;

    @GetMapping("/demo")
    public String hello(){
        logger.info(" ===>> hello.hello() ... ");
        logger.error(" ===>> hello.hello() error: {}", "错误信息...");

        return "hello spring boot ...";
    }

    @GetMapping("/logger")
    public String logger(){
        logger.info(" ===>> hello.logger() info ... ");
        logger.error(" ===>> hello.logger() error: {}", "错误信息...");

        return "hello spring boot logger ...";
    }

    @GetMapping("/person")
    public Person person(){

        logger.info(" ===>> hello.person() ... ");
        logger.info(" ===>> person: {}", JSONObject.toJSONString(person));



        logger.error(" ===>> hello.hello() error: {}", "错误信息...");

        return person;
    }


}
