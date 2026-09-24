package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/sumar/{a}/{b}")
    public String sumar(@PathVariable int a, @PathVariable int b) {
        return "Resultado: " + (a+b);
    }

      //es mayor de edad
    public String mayorEdad(@PathVariable int edad) {
    return  (edad >= 18 ) ? "mayor de edad" : "Menor de edad";

    }


    //sumar 2 numeros
    public String sumar (@PathVariable int a, @PathVariable int b) {
        return "resultado: " + (a+b);
    }

    
}
