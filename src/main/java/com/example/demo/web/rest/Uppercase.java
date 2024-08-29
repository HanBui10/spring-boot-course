package com.example.demo.web.rest;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dbo.restweb.UpperRestweb;

@RestController
@RequestMapping("/")
public class Uppercase {

    //@Autowired

    private final HelloService helloService;

    public Uppercase(@Qualifier("alternaviteHelloService") HelloService helloService) {
        this.helloService = helloService;
    }

    @PostMapping("/uppercase")
    public UpperRestweb uppercase(@RequestBody UpperRestweb input) {

        return helloService.uppercase(input);
    }

    /*@Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }*/
}