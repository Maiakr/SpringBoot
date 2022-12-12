package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    List<Persona> listaPersonas = new ArrayList();
    @GetMapping("/hola/{nombre}/{apellido}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido) {
                                return "Hola mundo " + nombre + " Apellido: " + apellido;
    }
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido,
                             @RequestParam int age) {
        return "Chau mundo " + nombre + " apellido: " + apellido
                + " Edad: " + age;
    }

    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        listaPersonas.add(pers);
    }
@GetMapping ("/ver/personas")
@ResponseBody
    public List<Persona> verPersonas () {
        return listaPersonas;

    }

}
