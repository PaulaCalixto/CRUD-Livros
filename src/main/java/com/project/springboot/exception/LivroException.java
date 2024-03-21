package com.project.springboot.exception;

public class LivroException extends RuntimeException {
    public LivroException(String mensagem) {
        super(mensagem);
    }
}
