package com.atstudy.spring.boot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: hdxin
 * Date: 2018-05-04
 * Time: 20:17
 */

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate template;

    @ResponseBody
    @GetMapping("/add")
    public String add(){

        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("v");
        template.opsForValue().set("abc", "测试");

        template.opsForList().leftPushAll("qq",list); // 向redis存入List
        template.opsForList().range("qwe",0,-1).forEach(value ->{
            System.out.println(value);
        });

        return "success";
    }

}
