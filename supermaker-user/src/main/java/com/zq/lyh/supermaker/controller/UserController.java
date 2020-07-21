package com.zq.lyh.supermaker.controller;


import com.zq.lyh.supermaker.entity.User;
import com.zq.lyh.supermaker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{userName}")
    public User getUser(@PathVariable String userName){
        return  userService.getUser(userName);
    }
}
