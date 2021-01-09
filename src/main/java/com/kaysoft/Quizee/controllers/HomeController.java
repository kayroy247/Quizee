package com.kaysoft.Quizee.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("Welcome to Quizee")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public Map getStatus(){
        Map map = new LinkedHashMap<String, String>();
        map.put("status", "01");
        map.put("message", appVersion);
        return map;

    }
}

