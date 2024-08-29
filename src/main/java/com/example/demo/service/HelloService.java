package com.example.demo.service;

import com.example.demo.dbo.restweb.UpperRestweb;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface HelloService {

     UpperRestweb uppercase(@RequestBody UpperRestweb input);

}