package com.primeiroprojecto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Nosso primeiro projecto Spring Boot Web";
    }
    
}
