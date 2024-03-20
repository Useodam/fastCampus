package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

    // api/v1 으로 매핑
    @GetMapping("")
    public UserRequest user(){
        var user = new UserRequest();
        user.setName("홍길동");
        user.setTel("010-1111-1115");
        user.setEmail("hong@mail.com");

        log.info("user: {}", user);

        return user;
    }
}
