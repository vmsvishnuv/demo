package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String getSomeResponse(){
        return "Get Method is working";
    }

    @GetMapping("/hello")
    public String getHelloResponse(){
        return "Hello";
    }

    @GetMapping("/hi")
    public String getHiResponse(){
        return "Hiiiiiiiii";
    }
}
