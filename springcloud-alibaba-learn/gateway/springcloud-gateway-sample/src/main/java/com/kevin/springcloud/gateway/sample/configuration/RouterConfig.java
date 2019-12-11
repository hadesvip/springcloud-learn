package com.kevin.springcloud.gateway.sample.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 路由配置
 *
 * @author wangyong
 */
@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes().
//                route(r -> r.path("/user/getUser")
//                        .uri("http://localhost:9090").id("user_route"))
//                .build();
        ZonedDateTime minusTime = LocalDateTime.now().minusHours(1).atZone(ZoneId.systemDefault());
        return builder.routes()
                .route("after_route", r -> r.after(minusTime).uri("http://baidu.com"))
                .build();


    }


}
