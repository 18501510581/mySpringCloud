package com.example.sericeFeign.controller;

import com.example.sericeFeign.feign.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    SchedualService schedualServiceHi;

    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi2")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
