package model;

import java.time.LocalDateTime;

public class Livro {
    private Long id;
    private String titulos;
    private String isbn;
    private Integer anoPublicacao;
    private int quantidadeDisponivel;
    private Autor autor;

    public Livro() {
    }

    public Livro(Long id, Autor autor, String titulos, Integer anoPublicacao, String isbn, int quantidadeDisponivel) {
        this.id = id;
        this.titulos = titulos;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void emprestarLivro(){
        if (this.quantidadeDisponivel > 0){
            this.quantidadeDisponivel--;
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id='" + id + '\'' +
                ", titulos='" + titulos + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", autor='" + autor + '\'' +
                '}';
    }
}
