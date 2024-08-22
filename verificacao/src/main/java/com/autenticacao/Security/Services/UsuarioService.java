package com.autenticacao.Security.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.autenticacao.DTOs.CriarUsuarioDTO;
import com.autenticacao.DTOs.RecoveryJwtTokenDTO;
import com.autenticacao.DTOs.UsuarioLoginDTO;
import com.autenticacao.Model.RegraModel;
import com.autenticacao.Model.UsuarioModel;
import com.autenticacao.Repository.UsuarioRepository;
import com.autenticacao.Security.Autentic.JwtTokenService;
import com.autenticacao.Security.Config.SegurancaConfig;
import com.autenticacao.Security.Details.UsuarioDetailsImpl;

@Service
public class UsuarioService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SegurancaConfig segurancaConfig;

    public RecoveryJwtTokenDTO authenticateUsuario(UsuarioLoginDTO usuarioLoginDTO) {
        UsernamePasswordAuthenticationToken usuarioPassword = new UsernamePasswordAuthenticationToken(
                usuarioLoginDTO.email(), usuarioLoginDTO.password());

        Authentication authentication = authenticationManager.authenticate(usuarioPassword);

        UsuarioDetailsImpl usuarioDetailsImpl = (UsuarioDetailsImpl) authentication.getPrincipal();

        return new RecoveryJwtTokenDTO(jwtTokenService.generateToken(usuarioDetailsImpl));

    }

    public void CriarUsuario(CriarUsuarioDTO criarUsuarioDTO){
        UsuarioModel usuarioModel = UsuarioModel.builder()
        .email(criarUsuarioDTO.email())
        .senha(segurancaConfig.passwordEncoder().encode(criarUsuarioDTO.senha()))
        .regras(List.of(RegraModel.builder().tipo(criarUsuarioDTO.regras()).build()))
        .build();

        usuarioRepository.save(usuarioModel);
    }

}
