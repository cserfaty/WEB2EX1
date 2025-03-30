package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 + num2;
        return "O resultado da soma de " + num1 + " + " + num2 + " é " + resultado;
    }
}
