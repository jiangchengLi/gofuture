package com.future.certification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    @ResponseBody
    @RequestMapping("getUserName")
    public String getUserName(){
        return "admin";
    }
}
