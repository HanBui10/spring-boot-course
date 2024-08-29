package com.example.demo.service.impl;

import com.example.demo.dbo.restweb.UpperRestweb;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class AlternaviteHelloService implements HelloService {
    @Override
    public UpperRestweb uppercase(UpperRestweb input) {
        String reversedFirstName = new StringBuilder(input.getFirstName().toUpperCase()).reverse().toString();
        String reversedLastName = new StringBuilder(input.getLastName().toUpperCase()).reverse().toString();
        input.setFirstName(reversedFirstName);
        input.setLastName(reversedLastName);
        return input;

    }
}
