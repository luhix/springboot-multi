package com.zsn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lhx
 * @Date 2020/4/18 10:02
 * @Version 1.0
 **/
@RestController
public class UserController {

    @RequestMapping("/user")
    public String user() {
        return "user";
    }
}
