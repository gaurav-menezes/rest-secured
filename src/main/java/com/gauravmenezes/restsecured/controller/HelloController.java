package com.gauravmenezes.restsecured.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello World!";
    }

    @GetMapping("/about")
    public String getMethodName(HttpServletRequest request) {
        return "Gaurav: " + request.getRequestedSessionId();
    }

}
