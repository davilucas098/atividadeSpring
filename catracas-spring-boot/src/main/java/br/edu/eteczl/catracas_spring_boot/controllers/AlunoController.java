package br.edu.eteczl.catracas_spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoController {
   
    @GetMapping("/findbyname")
    public String findByName(@RequestParam String name){
        return "Olá Aluno "+ name;
    }
    
    @GetMapping("/get/{id}")
    public String getDavizao(@PathVariable(value = "id") String id) {
        return "id para pegar o usuario foi " + id;
    }

    

}
