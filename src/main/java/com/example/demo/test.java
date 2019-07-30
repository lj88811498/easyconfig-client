package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Monkey
 * @Date: Created in 15:44  2019/6/13.
 * @Description:
 */
@Controller
@RequestMapping("")
public class test
{

    @Value("${spring.port}")
    private String port;


    @Value("${server.port}")
    private String serverport;


    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println(port);
        return port + "\n" + serverport;
    }

}
