package com.user.controller;

import com.user.po.User;
import com.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //@Value("${jdbc.url}")
    private String springdatasourceurl;

    @GetMapping("/helloworld")
    public  String helloworld(){
        return "helloworld";
    }

    @GetMapping("/getMessage")
    public  String getMessage(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+springdatasourceurl);
        return springdatasourceurl;
    }

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public  String getName(@RequestParam(value = "id", required = false) String id){
        User user = userService.getUserByID(id);
        return user.getName();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public void addUser(@RequestParam(value = "name",required = false) String name,
                          @RequestParam(value = "email", required = false) String email,
                          @RequestParam(value = "telephone", required = false) String telephone){
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setTelephone(telephone);
        userService.save(user);
    }
}
