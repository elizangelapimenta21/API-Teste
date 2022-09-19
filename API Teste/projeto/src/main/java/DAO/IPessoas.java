package DAO;

import model.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IPessoas  extends JpaRepository <Pessoas, Integer> {


}
