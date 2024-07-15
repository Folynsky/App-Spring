package com.example.practica.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWordRestController {

    //Endpoint     
    @GetMapping({"/hello","hw","/xd"})    
    public String helloWorld() {
        System.out.println("Solicitud correcta");
        return "Hello, World!";
    }

}
