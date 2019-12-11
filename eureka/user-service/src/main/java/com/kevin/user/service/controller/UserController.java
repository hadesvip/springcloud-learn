package com.kevin.user.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 大哥加点注释吧
 *
 * @author wangyong
 */
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String hello(){
        return "hello";
    }

}
