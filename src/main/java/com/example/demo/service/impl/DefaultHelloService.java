package com.example.demo.service.impl;

import com.example.demo.dbo.restweb.UpperRestweb;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class DefaultHelloService implements HelloService {
    @Override
    public UpperRestweb uppercase(UpperRestweb input) {
        input.convertToUppercase();
        return input;

    }
}
