package com.nhnacademy.mini_dooray.real_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder  builder) {
        return builder.routes()
                .route("account-server", r -> r.path("/api/member/**")
                        .uri("http://localhost:8081/"))
                .route("task-server", r -> r.path("/api/project/**")
                        .uri("http://localhost:8082/"))
                .build();

    }
}
