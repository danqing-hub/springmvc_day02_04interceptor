package com.danqing.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 丹青
 * @date 2019/10/2-20:32
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testInterceptor")
    public String testIterceptor() {
        System.out.println("testInterceptor执行了……");
        return "success";
    }
}
