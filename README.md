# 📚 Sistema de Biblioteca

Sistema orientado a objetos em Java para gerenciamento de empréstimos de livros em uma biblioteca, com suporte a diferentes perfis de usuários (Alunos e Professores) e regras de negócio distintas para cada tipo.

---

## 🗂️ Estrutura do Projeto

```
sistema-biblioteca/
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── model/
            │   ├── Pessoa.java          # Classe abstrata base
            │   ├── Usuario.java         # Classe abstrata para usuários da biblioteca
            │   ├── Aluno.java           # Usuário do tipo Aluno
            │   ├── Professor.java       # Usuário do tipo Professor
            │   ├── Autor.java           # Autor de livros
            │   ├── Livro.java           # Entidade Livro
            │   └── Emprestimo.java      # Registro de empréstimo
            └── Teste/
                └── Main.java            # Classe de testes e demonstração
```

---

## 🧱 Diagrama de Classes

```
           ┌──────────────┐
           │   Pessoa     │  (abstract)
           │──────────────│
           │ id: Long     │
           │ nome: String │
           │ cpf: String  │
           └──────┬───────┘
                  │
        ┌─────────┴──────────┐
        │                    │
 ┌──────┴───────┐    ┌───────┴──────┐
 │   Usuario    │    │    Autor     │
 │  (abstract)  │    │──────────────│
 │──────────────│    │ nacionalidade│
 │ email: String│    └──────────────┘
 │ tipo: String │
 │ getPrazo()   │  (abstract)
 │ getLimite()  │  (abstract)
 └──────┬───────┘
        │
  ┌─────┴──────┐
  │            │
┌─┴──────┐ ┌──┴────────┐
│ Aluno  │ │ Professor │
│────────│ │───────────│
│prazo:7d│ │prazo: 14d │
│limite:1│ │limite: 3  │
└────────┘ └───────────┘

┌───────────────────┐       ┌───────────────────────┐
│       Livro       │       │      Emprestimo        │
│───────────────────│       │───────────────────────│
│ id: Long          │       │ id: Long               │
│ titulos: String   │       │ usuario: Usuario       │
│ isbn: String      │◄──────│ livro: Livro           │
│ anoPublicacao: Int│       │ dataEmprestimo: Date   │
│ qtdDisponivel: int│       │ dataDevolucao: Date    │
│ autor: Autor      │       └───────────────────────┘
└───────────────────┘
```

---

## ⚙️ Regras de Negócio

| Tipo de Usuário | Prazo de Devolução | Limite de Empréstimos |
|:---------------:|:------------------:|:---------------------:|
| Aluno           | 7 dias             | 1 livro               |
| Professor       | 14 dias            | 3 livros              |

- A data de devolução é calculada automaticamente com base no tipo de usuário.
- O método `emprestarLivro()` decrementa o estoque disponível do livro a cada empréstimo.

---

## 🚀 Como Executar

### Pré-requisitos

- Java 25+
- Maven 3.8+

### Clonar o repositório

```bash
git clone https://github.com/seu-usuario/sistema-biblioteca.git
cd sistema-biblioteca
```

### Compilar o projeto

```bash
mvn compile
```

### Executar a classe de demonstração

```bash
mvn exec:java -Dexec.mainClass="Teste.Main"
```

---

## 💡 Exemplo de Uso

```java
// Criando um aluno
Aluno aluno = new Aluno(1L, "Lucas", "111.222.333-44", "Aluno", "lucas@gmail.com");

// Criando um autor e um livro
Autor autor = new Autor(1L, "Machado de Assis", "666.777.888-99", "Brasileira");
Livro livro = new Livro(1L, autor, "Dom Casmurro", 1899, "978-8535105537", 100);

// Registrando um empréstimo
Emprestimo emprestimo = new Emprestimo();
emprestimo.setUsuario(aluno);
emprestimo.setLivro(livro);
emprestimo.setDataEmprestimo(LocalDate.now());
emprestimo.setDataDevolucao(
    LocalDate.now().plusDays(aluno.getPrazoEmprestimoDias()) // 7 dias para aluno
);

livro.emprestarLivro(); // Decrementa o estoque
```

---

## 🛠️ Tecnologias

- **Java 25**
- **Maven** — gerenciamento de build e dependências
- **POO** — Herança, Abstração, Encapsulamento e Polimorfismo

---

## 📋 Melhorias Futuras

- [ ] Implementar camada de persistência (banco de dados)
- [ ] Adicionar validação de limite de empréstimos por usuário
- [ ] Criar interface de linha de comando (CLI) interativa
- [ ] Implementar sistema de multas por atraso na devolução
- [ ] Adicionar busca de livros por título, autor ou ISBN
- [ ] Cobertura de testes unitários com JUnit

---

## 👤 Autor

Desenvolvido como projeto de estudo de Programação Orientada a Objetos em Java.
