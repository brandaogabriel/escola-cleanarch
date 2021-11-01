package br.com.gabriel.escola.app.aluno.matricular;

import br.com.gabriel.escola.dominio.aluno.Aluno;
import br.com.gabriel.escola.dominio.aluno.CPF;
import br.com.gabriel.escola.dominio.aluno.Email;

public class AlunoInfo {

    private String cpf;
    private String nome;
    private String email;

    public AlunoInfo(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Aluno paraAluno() {
        return new Aluno(new CPF(cpf), nome, new Email(email));
    }
}
