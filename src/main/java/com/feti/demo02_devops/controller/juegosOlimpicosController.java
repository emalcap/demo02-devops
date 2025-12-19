package com.feti.demo02_devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/app/")
public class juegosOlimpicosController {
    // Datos en memoria: año → sede
    private static final Map<String, String> olympics = new LinkedHashMap<>();

    static {
        olympics.put("2024", "París, Francia");
        olympics.put("2021", "Tokio, Japón");
        olympics.put("2016", "Río de Janeiro, Brasil");
        olympics.put("2012", "Londres, Reino Unido");
        olympics.put("2008", "Pekín, China");
        olympics.put("2004", "Atenas, Grecia");
        olympics.put("2000", "Sídney, Australia");
        olympics.put("1996", "Atlanta, Estados Unidos");
        olympics.put("1992", "Barcelona, España");
        olympics.put("1988", "Seúl, Corea del Sur");
        olympics.put("1984", "Los Ángeles, Estados Unidos");
        olympics.put("1980", "Moscú, Rusia");
        olympics.put("1976", "Montreal, Canadá");
        olympics.put("1972", "Múnich, Alemania");
        olympics.put("1968", "Ciudad de México, México");
        olympics.put("1964", "Tokio, Japón");
        olympics.put("1960", "Roma, Italia");
        olympics.put("1956", "Melbourne, Australia");
        olympics.put("1952", "Helsinki, Finlandia");
        olympics.put("1948", "Londres, Reino Unido");
        olympics.put("1936", "Berlín, Alemania");
        olympics.put("1924", "París, Francia");
        olympics.put("1896", "Atenas, Grecia");
    }

    // Endpoint para devolver todos los Juegos Olímpicos
    @GetMapping("/olympics")
    public Map<String, String> getOlympics() {
        return olympics;
    }
}
