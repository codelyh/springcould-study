package com.zq.lyh.supermaker.supermakereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SupermakerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermakerEurekaApplication.class, args);
    }

}
