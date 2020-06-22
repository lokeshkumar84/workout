package com.example.workout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{


   @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name){

       return "hello "+name;

   }
}
