package com.example.demo.web.rest;

import com.example.demo.dbo.restweb.UpperRestweb;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Calculator {

    @GetMapping("/calculate")
    public Object calculate(
             double num1,
             char operator,
             double num2
             ) {

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                return "Invalid operator";
        }

        return result;
    }


}
