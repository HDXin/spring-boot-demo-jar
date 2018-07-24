package com.atstudy.spring.boot.exception;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: hdxin
 * Date: 2018-07-18
 * Time: 10:07
 */
@RestController
@RequestMapping("/ex")
public class ExceptionContrller {


    @PostMapping("/person")
    public Person create(@RequestBody Person person){

        if(StringUtils.isNotBlank(person.getName())
                && "Tom".equals(person.getName()))
            throw new RuntimeException("用户名已存在");

        person.setUserId(RandomUtils.nextLong(0, 10000));
        return person;
    }



}
