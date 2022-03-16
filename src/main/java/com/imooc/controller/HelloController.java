package com.imooc.controller;


import org.springframework.web.bind.annotation.*;


//@Controller
@RestController
public class HelloController {
    //    @RequestMapping("hello")
    @GetMapping("hello")
//    @PostMapping("hello")
    public String hello() {
        return "hello world";
    }
}
