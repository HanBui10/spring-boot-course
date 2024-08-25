package com.example.demo.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dbo.restweb.UpperRestweb;

@RestController
@RequestMapping("/")
public class Uppercase {
    @PostMapping("/uppercase")
    public UpperRestweb uppercase(@RequestBody UpperRestweb input) {
        input.convertToUppercase();
        return input;
    }
}
