package com.project.springboot.service;

import com.project.springboot.exception.LivroException;
import com.project.springboot.models.LivroModel;
import com.project.springboot.repositories.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public ResponseEntity<LivroModel> criarLivro(LivroModel livro) {
        if (livro.getTitulo() == null || livro.getAutor() == null ||
                livro.getEditora() == null || livro.getDescricao() == null ||
                livro.getGenero() == null || livro.getAnoLancamento() == null) {
            throw new LivroException("O livro não pode ser criado!");
        } else {
            LivroModel livroCriado = livroRepository.save(livro);
            return ResponseEntity.status(HttpStatus.CREATED).body(livroCriado);
        }
    }

    public List<LivroModel> listaLivro() {
        return livroRepository.findAll();
    }

    public ResponseEntity<LivroModel> atualizarLivro(LivroModel livroAtualizado, Long id) throws LivroException {

        Optional<LivroModel> livroModificado = livroRepository.findById(id);

        if (!livroModificado.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {

            LivroModel livro = livroModificado.get();
            livro.setAutor(livroAtualizado.getAutor());
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setGenero(livroAtualizado.getGenero());
            livro.setDescricao(livroAtualizado.getDescricao());
            livro.setEditora(livroAtualizado.getEditora());
            livro.setAnoLancamento(livroAtualizado.getAnoLancamento());
            livroRepository.save(livro);

            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }

    public void deletarLivro(Long id) {
        if (!livroRepository.existsById(id)) throw new LivroException("Livro não encontrado");
        livroRepository.deleteById(id);
    }
}
