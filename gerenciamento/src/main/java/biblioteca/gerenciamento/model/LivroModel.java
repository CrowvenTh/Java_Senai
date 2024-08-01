package biblioteca.gerenciamento.model;

import java.util.List;

import biblioteca.gerenciamento.Enum.statusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LivroModel {

    @Id
    private long isbn;

    @OneToOne
    private emprestimoModel emprestimo;
    
    private List<String> nomAutor;
    private String titulo;
    private int qntPages;
    private String tema;
    private int anoPub;
    private int edicao;
    private String editora;
    private int exemplares;
    private statusEnum status;

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public List<String> getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(List<String> nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQntPages() {
        return qntPages;
    }

    public void setQntPages(int qntPages) {
        this.qntPages = qntPages;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public statusEnum getStatus() {
        return status;
    }

    public void setStatus(statusEnum status) {
        this.status = status;
    }

}
