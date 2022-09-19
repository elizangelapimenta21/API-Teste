package Service;

import DAO.IPessoas;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

@Service
public final class PessoaService {
    private IPessoas;
    private PasswordEncoder passwordEncoder;

    public PessoaService(IPessoas){
        this.dao = dao;
        this.passwordEncoder = new BCryptPasswordEncorder();
    }

    public static List<Pessoa> listarPessoa(){
        List<Pessoa> lista = dao.findAll();
        return lista;
    }

    public Pessoa criarPessoa( Pessoa pessoa){
        String encorder = this.passwordEncoder.encode(pessoa.getIcpf());
        pessoa.setIcpf(encoder);
        Pessoa pessoaNovo = dao.save(pessoa);
        return pessoaNovo;
    }

    public Pessoa editarPessoa( Pessoa pessoa){
        Pessoa pessoaNovo = dao.save(pessoa);
        return pessoaNovo;
    }

    public Boolean excluirPessoa(ID id, JpaRepository<T, ID> dao){
        dao.deleteById(id);
        return true;
    }

    public Boolean validarCPF(Pessoa pessoa, JpaRepository<T, ID> dao){
        String cpf = dao.getById(pessoa.getIid()).getIcpf();
        boolean valid = false; passwordEncoder.matches(pessoa.getIcpf(), cpf);
        return valid;
    }


}


