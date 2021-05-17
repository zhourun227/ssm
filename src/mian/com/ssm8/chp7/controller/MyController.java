package mian.com.ssm8.chp7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/hello")
public class MyController {
    @RequestMapping(value = "/mycontroller")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
        model.addAttribute("mmsg","基于注释的spring mvc使用");
        return "two";
    }
}
