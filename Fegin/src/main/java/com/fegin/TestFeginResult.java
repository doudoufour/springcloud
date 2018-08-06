package com.fegin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeginResult {
    @Autowired
    private FeginClientController _client;

    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    public int getResult(@RequestParam int a, @RequestParam int b){
        return _client.add(a,b);
    }

}
