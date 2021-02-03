package com.tang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author: create by shujuan.tang
 * @description: com.tang.controller
 * @date:2021/1/16
 **/
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Worlds!";
    }



    @RequestMapping("/thyme")
    public String success(Map<String,Object> map) {
        map.put("thyme","thyme say hello world");
        System.out.println("thyme hello");
        return "success";
    }
}
