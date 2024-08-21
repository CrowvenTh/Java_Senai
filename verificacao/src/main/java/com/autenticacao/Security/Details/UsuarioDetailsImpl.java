package com.autenticacao.Details;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.autenticacao.Model.UsuarioModel;

import lombok.Getter;

@Getter
public class UsuarioDetailsImpl implements UserDetails {

    private UsuarioModel user;

    public UsuarioDetailsImpl(UsuarioModel user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getRegras().stream().map(regras -> new SimpleGrantedAuthority(regras.getTipo().tipo()))
                .collect(Collectors.toList());

    }

    @Override
    public String getPassword() {
        return user.getSenha();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }
    @Override
    public boolean isEnabled(){
        return true;
    }

}
