//Interface de repositório JPA para operações CRUD.
package br.com.api.filme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.filme.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
