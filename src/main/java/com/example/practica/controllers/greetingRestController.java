package com.example.practica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class greetingRestController {

    @GetMapping("/saludo/{name}")
    public String greting(@PathVariable String name){
        return "Hola, " + name;
    }

}
