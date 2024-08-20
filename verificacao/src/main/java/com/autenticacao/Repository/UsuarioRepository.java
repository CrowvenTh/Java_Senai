package com.autenticacao.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autenticacao.Model.RegraModel;
import com.autenticacao.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<RegraModel, Long> {

    Optional<UsuarioModel> findByEmail(String email);

}
