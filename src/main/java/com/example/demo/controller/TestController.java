package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/hi")
    public String hi(String name){
        return "hello "+name;
    }

    @GetMapping("/hhh")
    public  String hh(){
        return "哈麻皮好多！！！";
    }

    @GetMapping("/abc")
    public  String abc(){
        return "奥斯卡了的纳税爱上了多年";
    }

}
