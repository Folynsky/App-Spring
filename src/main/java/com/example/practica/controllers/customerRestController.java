package com.example.practica.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica.model.customer;
@RestController
public class customerRestController {



    private List<customer> customers = new ArrayList<>(Arrays.asList(

        new customer(1,"John Doe", "Jhondu", "1234"),
        new customer(2,"Jane Smith", "Alex Perrez", "34534"),
        new customer(3,"Jane Smith", "Alex Perrez", "34534"),
        new customer(4,"Jane Smith", "Alex Perrez", "34534")
    ));
    
    @GetMapping("clientes")
    public List<customer> getCustomers() {
        return customers;
    }
    }
