package com.example.practica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class palindromController {

    @GetMapping("/validar-palindromo/{word}")
    public String palindrom(@PathVariable String word) {
        if  (isPalindrom(word)){
            return "La palabra "+ word +" es palindroma";
        }
        return "La palabra "+ word +" no es palindroma";

    }

    private boolean isPalindrom(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
