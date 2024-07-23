package Model;

<<<<<<< Updated upstream


@Entity
@Table(name = "Resultdos")
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id RES")
    private long idRes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula")
    public Aluno getMatricula(){

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "Id Disciplina", referencedColumnName = "Id Disciplina")
        private Disciplinas idDis;
        
        public long getId() {
            return id;
        }
    
    
        public long getId() {
            return id;
        }
    
        public void setId(long id) {
            this.id = id;
        }
        public void setId(long id) {
            this.id = id;
        }

    }

}


=======
public class Resultados {

}
>>>>>>> Stashed changes
