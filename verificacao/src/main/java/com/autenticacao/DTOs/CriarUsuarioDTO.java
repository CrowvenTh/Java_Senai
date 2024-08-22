package com.autenticacao.DTOs;

import com.autenticacao.Enum.RegrasEnum;

public record CriarUsuarioDTO(
    String email,
    String senha,
    RegrasEnum regras
){
       
}
