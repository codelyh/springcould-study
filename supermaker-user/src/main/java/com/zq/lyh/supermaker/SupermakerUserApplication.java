package com.zq.lyh.supermaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SupermakerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermakerUserApplication.class, args);
    }

}
