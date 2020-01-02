package com.qdproject.demo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworld {
    @RequestMapping("/helloworld")
    public String hello(){
        return "hello";
    }
}
