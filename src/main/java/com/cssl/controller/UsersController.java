package com.cssl.controller;

import com.cssl.pojo.Users;
import com.cssl.service.UserApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @DubboReference
    private UserApi userApi;


    @GetMapping("/find")
    public List<Users> find(){
        return userApi.show();
    }
}
