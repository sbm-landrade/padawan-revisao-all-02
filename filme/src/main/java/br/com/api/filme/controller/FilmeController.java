package br.com.api.filme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.filme.model.Filme;
import br.com.api.filme.service.FilmeService;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
	@Autowired
	private FilmeService filmeService;

	@GetMapping
	public List<Filme> listarFilmes() {
		return filmeService.listarTodos();
	}
}
