package model;

public abstract class Usuario extends Pessoa {
    private String email;
    private String tipo;

    public abstract int getPrazoEmprestimoDias();
    public abstract int getLimitesEmprestimos();

    public Usuario(){

    }

    public Usuario(Long id, String nome, String cpf, String tipo, String email) {
        super(id, nome, cpf);
        this.email = email;
        this.tipo = tipo;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + getNome() + '\'' +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", id='" + getId() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                '}';
    }
}
