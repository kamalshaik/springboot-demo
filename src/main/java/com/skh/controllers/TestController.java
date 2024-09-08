package com.skh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("name212")
    public String myName(){
        
        return "kamal";
    }
}
