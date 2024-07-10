package com.senai.primeirospassos.view;

import com.senai.primeirospassos.model.Usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioView {
    public void save(Usuario usuario){
        System.out.println("Salvar - Recebendo um novo usuário");
        System.out.println(usuario);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add((new Usuario("Thiago", "1234")));
        usuarios.add((new Usuario("Antonio", "4567")));
        return usuarios;
    }
}
