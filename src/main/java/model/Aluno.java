package model;

public class Aluno extends Usuario{

    public Aluno() {
    }

    public Aluno(Long id, String nome, String cpf, String tipo, String email) {
        super(id, nome, cpf, email, tipo);
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 7;
    }

    @Override
    public int getLimitesEmprestimos() {
        return 1;
    }


}
