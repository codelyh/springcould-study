package com.zq.lyh.supermaker.service;

import com.zq.lyh.supermaker.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "supermaker-user")
public interface UserService {

    @GetMapping("/getUser/{userName}")
    User getUser(@PathVariable String userName);

}
