package escola.secretaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Aluno;

public interface AlunoRepository extends JpaRepository {

    public List<Aluno> findAll();

}
