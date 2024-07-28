package br.com.api.filme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.filme.model.Filme;
import br.com.api.filme.repository.FilmeRepository;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> listarTodos() {
        return filmeRepository.findAll();
    }

    public Optional<Filme> buscarPorId(Long id) {
        return filmeRepository.findById(id);
    }

    public Filme salvar(Filme filme) {
        return filmeRepository.save(filme);
    }

    public void deletar(Long id) {
        filmeRepository.deleteById(id);
    }
}
