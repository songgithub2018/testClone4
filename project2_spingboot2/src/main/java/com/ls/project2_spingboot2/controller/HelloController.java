package com.ls.project2_spingboot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lS
 * @date 2022/1/9-9:32
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "/hello";
    }
}
