package com.atstudy.spring.boot.thymeleaf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/templates")
public class ThymeleafController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/mail")
    public String hello(Map<String, String> resultMap){
        logger.info(" ===>> templates mail  ... ");

        resultMap.put("hello", "hello hiahia");
        return "mail";
    }

}
