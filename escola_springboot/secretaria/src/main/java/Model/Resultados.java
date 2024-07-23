package Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Resultdos")
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id RES")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula")
    public Aluno getMatricula(){

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "Id Disciplina", referencedColumnName = "Id Disciplina")
        private Disciplinas id;

     

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }   

    }

}
