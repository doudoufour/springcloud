package com.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("hello")
    public String hello(){
        return hystrixService.getHelloContent();
    }
}
