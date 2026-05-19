package Teste;

import model.*;

import java.time.LocalDate;

public class Main {
    static void main() {

        // ===== ALUNOS =====

        Aluno a1 = new Aluno();
        a1.setId(1L);
        a1.setNome("LUCAS");
        a1.setCpf("111.222.333-44");
        a1.setTipo("Aluno");
        a1.setEmail("lucas@gmail.com");

        // Aluno a2 = new Aluno(2L, "JOÃO", "222.333.444-55", "Aluno", "joao@gmail.com");
        Aluno a3 = new Aluno(2L, "JOÃO", "222.333.444-55", "Aluno", "joão@gmail.com");

        Professor p1 = new Professor();
        p1.setId(3L);
        p1.setNome("Fernando");
        p1.setCpf("444.555.666.77");
        p1.setTipo("Professor");
        p1.setEmail("fernando@gmail.com");

        // ===== PROFESSORES =====

        Professor p2 = new Professor(4L, "Luiza", "555.666.777-88", "Professora", "luiza@gmail.com");

        Autor autor1 = new Autor();
        autor1.setId(1L);
        autor1.setNome("Machado de Assis");
        autor1.setCpf("666.777.888-99");
        autor1.setNacionalidade("Brasileira");

        Autor autor2 = new Autor(2L, "Clarice Lispector", "777.888.999-00", "Brasileira");

        // ===== LIVROS =====

        Livro l1 = new Livro();
        l1.setId(1L);
        l1.setAutor(autor1);
        l1.setTitulos("Dom Casmurro e Memórias Póstumas de Brás Cubas.");
        l1.setAnoPublicacao(1839);
        l1.setIsbn("ISBN-13. 978-8535105537");
        l1.setQuantidadeDisponivel(100);

        Livro l2 = new Livro(2L, autor2, "A Hora da Estrela.", 1920, "978-8532508126", 50);

        // ===== EMPRESTIMO =====

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(1L);
        emprestimo.setDataEmprestimo(LocalDate.now());
        LocalDate dataDevolucao = emprestimo.getDataEmprestimo().plusDays(a1.getPrazoEmprestimoDias());
        emprestimo.setDataDevolucao(dataDevolucao);
        emprestimo.setUsuario(a1);
        l1.emprestarLivro();
        emprestimo.setLivro(l1);

        Emprestimo emprestimo2 = new Emprestimo();
        emprestimo2.setId(2L);
        emprestimo2.setDataEmprestimo(LocalDate.now());
        LocalDate dataDevolucao2 = emprestimo.getDataEmprestimo().plusDays(p1.getPrazoEmprestimoDias());
        emprestimo2.setDataDevolucao(dataDevolucao2);
        emprestimo2.setUsuario(p1);
        l2.emprestarLivro();
        emprestimo2.setLivro(l2);

        System.out.println("===== ALUNOS =====");
        System.out.println(a1);
        System.out.println(a3);
        System.out.println("===== PROFESSORES =====");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(autor1);
        System.out.println(l1);

        System.out.println(autor2);
        System.out.println(l2);


    }
}
