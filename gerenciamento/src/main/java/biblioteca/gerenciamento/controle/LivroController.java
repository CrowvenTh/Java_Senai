package biblioteca.gerenciamento.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.gerenciamento.model.LivroModel;
import biblioteca.gerenciamento.repositorio.LivroRepository;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LivroController {

    @Autowired
    private LivroRepository livro;

    @GetMapping("/teste")
    public String teste() {
        return "Testado!!!";
    }

    @PostMapping("/adicionarlivro")
    public LivroModel addLivro(LivroModel livro) {
        return LivroRepository.save(livro);
    }

    @GetMapping("listarlivros")
    public List<LivroModel> listarLivros() {
        return LivroRepository.findAll();
    }

}
