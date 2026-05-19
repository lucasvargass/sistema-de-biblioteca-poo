package model;

public class Professor extends Usuario{

    public Professor() {
    }

    public Professor(Long id, String nome, String cpf, String tipo, String email) {
        super(id, nome, cpf, email, tipo);
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 14;
    }

    @Override
    public int getLimitesEmprestimos() {
        return 3;
    }


}
