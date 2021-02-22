package com.tang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author: create by shujuan.tang
 * @description: com.tang.controller
 * @date:2021/2/6
 **/
@Controller
public class LoginController {

    @PostMapping(value = "/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        Map<String, Object> map,
                        HttpSession session) {
        if (!StringUtils.isEmpty(username) && "3344".equals(password)) {
            //记录已登录用户
            session.setAttribute("loginUser",username);
            //防止表单重复提交，重定向页面
            return "redirect:/main.html";

        } else {
            map.put("msg", "账号或密码错误");
            return "login";
        }
    }
}
