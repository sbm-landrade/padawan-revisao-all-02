package br.com.api.filme.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.api.filme.model.Filme;
import br.com.api.filme.service.FilmeService;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> listarTodos() {
        return filmeService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        Optional<Filme> filme = filmeService.buscarPorId(id);
        if (filme.isPresent()) {
            return ResponseEntity.ok(filme.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme) {
        return filmeService.salvar(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizar(@PathVariable Long id, @RequestBody Filme filme) {
        if (!filmeService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        filme.setId(id);
        filmeService.salvar(filme);
        return ResponseEntity.ok(filme);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!filmeService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        filmeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
