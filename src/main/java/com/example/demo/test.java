package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class test {


    @RequestMapping("select")
    public String getLogin(){
        System.out.println("刘晓林");
         return "刘晓林";
    }


}
