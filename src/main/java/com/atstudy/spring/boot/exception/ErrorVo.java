package com.atstudy.spring.boot.exception;

import org.springframework.http.HttpStatus;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: hdxin
 * Date: 2018-07-18
 * Time: 10:04
 */
public class ErrorVo {

    private int code;
    private String message;

    public ErrorVo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
