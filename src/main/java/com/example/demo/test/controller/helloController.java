package com.example.demo.test.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    public String sayHello(){
        return "test";
    }

    @RequestMapping(value = "/loginIn.do")
    @ResponseBody
    public UserBean login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        return userBean;
    }

}
