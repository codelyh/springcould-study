package com.zq.lyh.supermaker.service.impl;

import com.zq.lyh.supermaker.entity.User;
import com.zq.lyh.supermaker.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String userName) {
        User user = User.builder().userId(1).age(12).name(userName).build();
        return user;
    }
}
