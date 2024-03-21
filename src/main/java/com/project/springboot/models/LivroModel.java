package com.project.springboot.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "livraria")
public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String editora;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private Integer anoLancamento;
}
