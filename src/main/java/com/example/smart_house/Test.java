package com.example.smart_house;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Test {


    @GetMapping("/test")
    public String get(){
        return "Hello World";
    }


}