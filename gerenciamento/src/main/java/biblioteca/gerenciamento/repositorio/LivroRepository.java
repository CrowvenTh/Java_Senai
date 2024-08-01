package biblioteca.gerenciamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.gerenciamento.model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Integer>{
    

}
