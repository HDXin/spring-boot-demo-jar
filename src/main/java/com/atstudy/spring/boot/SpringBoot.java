package com.atstudy.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @SpringBootApplication 来标注一个主应用程序类，说明这是一个 SpringBoot 应用
 */
@SpringBootApplication
public class SpringBoot {
    private static final Logger logger = LoggerFactory.getLogger(SpringBoot.class);
    public static void main(String[] args){
        logger.info(" ===>> spring boot main ... ");
        SpringApplication.run(SpringBoot.class, args);
    }
}