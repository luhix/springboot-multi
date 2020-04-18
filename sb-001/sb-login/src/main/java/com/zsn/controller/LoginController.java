package com.zsn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author lhx
 * @Date 2020/4/18 10:03
 * @Version 1.0
 **/
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
