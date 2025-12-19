package com.feti.demo02_devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app/")
public class HelloController {
//"Proyecto gestionado por Emalcap"
    @GetMapping("/Map/String")
    public Map<String, String> foot() {
        Map<String, String> json = new HashMap<>();
        json.put("message", "Sprint Boot api rest");
        return json;

    }
     /*
    @GetMapping
    public String saludar() {
        return "¡Hola desde el controlador Spring Boot!";
    }
    @GetMapping("/paises")
    public Map<String, String> getPaises() {
        Map<String, String> paises = new HashMap<>();
        paises.put("PE", "Perú");
        paises.put("MX", "México");
        paises.put("AR", "Argentina");
        paises.put("CL", "Chile");
        paises.put("US", "Estados Unidos");
        return paises;
    } */
}