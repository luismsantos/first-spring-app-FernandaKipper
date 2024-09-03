package com.luis.first_spring_app.controller;

import com.luis.first_spring_app.configuration.HelloConfiguration;
import com.luis.first_spring_app.domain.User;
import com.luis.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    @Autowired
//    private SDKAWS sdkaws ;

    @GetMapping()
    // esse metodo responde as req GET no endpoint /hello-world
    public String helloWorld() {
        return helloWorldService.helloWorld("Luis");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter",  defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World Post" + filter;
    }

}
