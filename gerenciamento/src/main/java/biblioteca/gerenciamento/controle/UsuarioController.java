package biblioteca.gerenciamento.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.gerenciamento.model.usuarioModel;
import biblioteca.gerenciamento.repositorio.UsuarioRepository;



@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/adicionarusuario")
    public usuarioModel addUsuario(@RequestBody usuarioModel usuario) {
        //TODO: process POST request
        return usuarioRepository.save(usuario);
    }
    @GetMapping("listarusuarios")
    public List<usuarioModel> listausuario() {
        return usuarioRepository.findAll();
    }
    
}
