package com.kevin.nacos.sample;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口
 *
 * @author wangyong
 */
@NacosPropertySource(dataId = "config-center", autoRefreshed = true)
@SpringBootApplication
public class NacosSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSampleApplication.class, args);
    }

}
