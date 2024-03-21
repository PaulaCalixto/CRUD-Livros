package com.project.springboot.controllers;

import com.project.springboot.models.LivroModel;
import com.project.springboot.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @PostMapping
    public ResponseEntity<LivroModel> criarLivro(@RequestBody LivroModel livro) {
        return service.criarLivro(livro);
    }

    @GetMapping
    public List<LivroModel> listarLivro() {
        return service.listaLivro();
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroModel> atualizarLivro(@PathVariable Long id, @RequestBody LivroModel livro) {
        return service.atualizarLivro(livro, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarLivro(@PathVariable Long id) {
        service.deletarLivro(id);
        return ResponseEntity.status(HttpStatus.OK).body("Apagado com sucesso!");
    }
}
