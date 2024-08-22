package com.autenticacao.DTOs;

import java.util.List;

import com.autenticacao.Model.RegraModel;

public record RecoveryUsuarioDTO(
    Long id,
    String email,
    List<RegraModel> regras
) {

}
