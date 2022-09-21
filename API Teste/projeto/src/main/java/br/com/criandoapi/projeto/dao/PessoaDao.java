package br.com.criandoapi.projeto.dao;

import br.com.criandoapi.projeto.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDao extends JpaRepository<Pessoa, Integer> {

}
