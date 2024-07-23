package Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Resultdos")
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id RES")
    private long idRes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula")
    public Aluno getMatricula() {

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "Id Disciplina", referencedColumnName = "Id Disciplina")
        private Disciplinas idDis;
        return null;
    }

    public long getIdRes() {
        return idRes;
    }

    public void setIdRes(long idRes) {
        this.idRes = idRes;
    }

}
