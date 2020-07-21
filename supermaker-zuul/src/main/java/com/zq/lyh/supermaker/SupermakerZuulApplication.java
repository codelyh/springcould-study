package com.zq.lyh.supermaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SupermakerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermakerZuulApplication.class, args);
    }

}
