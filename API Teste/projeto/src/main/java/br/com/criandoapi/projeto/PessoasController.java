package br.com.criandoapi.projeto;

import Service.Pessoa;
import Service.PessoaService;
import com.sun.xml.bind.v2.model.core.ID;
import model.Pessoas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("*")
@RequestMapping("/pessoas")
public class PessoasController {

    @Autowired

    private JpaRepository<T, ID> dao;
    private PessoaService pessoaService;

    public PessoasController(){
        this.pessoaService = null;


    }

    @GetMapping
    public ResponseEntity<List<Pessoas>> listaPessoas() {
        return ResponseEntity.status(200).body(PessoaService.listarPessoa(Pessoa));

    }

    @PostMapping
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa, Pessoa Pessoa) {
        return ResponseEntity.status(201).body(pessoaService.criarPessoa(Pessoa));

    }

    @PutMapping
    public ResponseEntity <Pessoa> editarPessoa(@RequestBody Pessoa pessoa, Pessoa Pessoa) {
        return ResponseEntity.status(200).body(pessoaService.editarPessoa(Pessoa);
    }

    @PostMapping ("/cpf")
    public ResponseEntity<Object> validarCPF(@RequestBody Pessoa pessoa){
        Boolean valid = pessoaService.validarCPF(pessoa, dao);
        if (!valid) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.status(200).build();
    }

    private class T {
    }
}
