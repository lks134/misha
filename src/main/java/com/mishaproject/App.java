package com.mishaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration//将app的启动类当成一个自动化可以支持配置的bean并且能够开启一个工程类基于springboot的自动化配置
@RestController
public class App
{
    @RequestMapping("/")
    public String home(){
        return "hello word";
    }
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
