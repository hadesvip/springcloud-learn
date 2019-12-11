package com.kevin.springcloud.gateway.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 *
 * @author wangyong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserList")
    public String getUserList() {
        return "getUserList";
    }

    @GetMapping("/getUser")
    public String getUser() {
        return "getUser";
    }
}
