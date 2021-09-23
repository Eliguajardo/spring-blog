package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HelloController {
    @GetMapping("/go")
    @ResponseBody
    public String helloFromSpring(){
        return "hello from the world of Spring Boot.";

    }
    @GetMapping("/helloworld/{username}")
    @ResponseBody
    public String helloWorld(@PathVariable String username){
        return "hello world "+ username +"!";

    }
    @GetMapping("/Happy_Birthday/{username}")
    @ResponseBody
    public String helloWorld(
            @PathVariable String username,
            @PathVariable int age
    ){
        return "hello world "+ username +"You are now " + age + "years old";

    }
    @GetMapping("random/number")
    @ResponseBody
    public int RandomNumber(){
        Random r = new Random();
        int low = 1;
        int high = 100;
        return r.nextInt(high-low)+ low;
    }

}
