package br.com.criandoapi.projeto.controller;

import br.com.criandoapi.projeto.service.PessoaService;
import br.com.criandoapi.projeto.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pessoas")
public class PessoasController {

    @Autowired
    private PessoaService pessoaService;

    public PessoasController() {
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> listaPessoas() {
        return ResponseEntity.status(200).body(pessoaService.listarPessoa());
    }

    @PostMapping
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.status(201).body(pessoaService.criarPessoa(pessoa));
    }

    @PutMapping
    public ResponseEntity<Pessoa> editarPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.status(200).body(pessoaService.editarPessoa(pessoa));
    }

    //Não existia um endpoint no controller para exclusão de pessoas.
    @DeleteMapping
    public ResponseEntity<Boolean> excluirPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.status(200).body(pessoaService.excluirPessoa(pessoa.getId()));
    }

    @PostMapping("/cpf")
    public ResponseEntity<Object> validarCPF(@RequestBody Pessoa pessoa) {
        Boolean valid = pessoaService.validarCPF(pessoa);
        if (!valid) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.status(200).build();
    }
}
