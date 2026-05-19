package model;

public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor() {
    }

    public Autor(Long id, String nome, String cpf, String nacionalidade) {
        super(id, nome, nacionalidade);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nacionalidade='" + nacionalidade + '\'' +
                "id='" + getId() + '\'' +
                "nome='" + getNome() + '\'' +
                '}';
    }
}
