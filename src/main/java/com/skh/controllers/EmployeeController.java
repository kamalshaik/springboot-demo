package com.skh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("name")
    public String myName(){
        return "kamal";
    }
}
