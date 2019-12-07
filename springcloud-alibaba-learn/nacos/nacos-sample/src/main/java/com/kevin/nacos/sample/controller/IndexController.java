package com.kevin.nacos.sample.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author wangyong
 */
@RestController
public class IndexController {


    @NacosValue(value = "${app.name}", autoRefreshed = true)
    private String appName;


    @GetMapping
    public String index() {
        return "hello," + appName;
    }

}
