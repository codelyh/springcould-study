package com.zq.lyh.supermaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启zuul的网关功能，他是一个组合注解，集成了eureka客户端注解。
public class SupermakerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermakerZuulApplication.class, args);
    }

}
