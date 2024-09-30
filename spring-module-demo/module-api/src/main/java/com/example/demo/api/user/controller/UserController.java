package com.example.demo.api.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.user.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/findAll")
    public ResponseEntity<List<?>> findALl() {
        log.info(">>>>>>>>>>>>>>>>>>>>> AdminController.findAll");
        List<?> result = userService.findAll();
        log.info(">>>>>>>>>>>>>>>>>>> Result : {}", result.toString());
        return ResponseEntity.ok(result);
    }
}

