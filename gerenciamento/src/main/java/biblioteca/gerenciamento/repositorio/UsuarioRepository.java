package biblioteca.gerenciamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.gerenciamento.model.usuarioModel;

public interface UsuarioRepository extends JpaRepository<usuarioModel, Integer>{
    

}
