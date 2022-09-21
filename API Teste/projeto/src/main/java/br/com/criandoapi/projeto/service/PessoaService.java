package br.com.criandoapi.projeto.service;

import br.com.criandoapi.projeto.dao.PessoaDao;
import br.com.criandoapi.projeto.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaDao dao;
    private PasswordEncoder passwordEncoder;

    public PessoaService() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public List<Pessoa> listarPessoa() {
        List<Pessoa> lista = dao.findAll();
        return lista;
    }

    public Pessoa criarPessoa(Pessoa pessoa) {
        String encoder = this.passwordEncoder.encode(pessoa.getCpf());
        pessoa.setCpf(encoder);
        Pessoa pessoaNovo = dao.save(pessoa);
        return pessoaNovo;
    }

    public Pessoa editarPessoa(Pessoa pessoa) {
        Pessoa pessoaNovo = dao.save(pessoa);
        return pessoaNovo;
    }

    public Boolean excluirPessoa(Integer id) {
        dao.deleteById(id);
        return true;
    }

    public Boolean validarCPF(Pessoa pessoa) {
        String cpf = dao.getReferenceById(pessoa.getId()).getCpf();
        boolean valid = false;
        passwordEncoder.matches(pessoa.getCpf(), cpf);
        return valid;
    }


}


