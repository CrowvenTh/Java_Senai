package escola.secretaria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Aluno;
import escola.secretaria.repository.AlunoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/lista")
    public List<Aluno> lista() {
        return alunoRepository.findAll();
    }
    @PostMapping("/inserir")
    public Aluno inserirAluno(@RequestBody String Aluno aluno) {
        return alunoRepository.save(aluno);

    }
    
}
