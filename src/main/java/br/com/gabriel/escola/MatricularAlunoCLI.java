package br.com.gabriel.escola;

import br.com.gabriel.escola.app.aluno.matricular.AlunoInfo;
import br.com.gabriel.escola.app.aluno.matricular.MatricularAluno;
import br.com.gabriel.escola.dominio.aluno.AlunosRepository;
import br.com.gabriel.escola.infra.aluno.AlunosRepositoryEmMemoria;

public class MatricularAlunoCLI {

    public static void main(String[] args) {
        String cpf = "123.456.789-00";
        String nome = "Gabriel";
        String email = "gabriel@email.com";

        AlunosRepository repository = new AlunosRepositoryEmMemoria();
        MatricularAluno matricularAluno = new MatricularAluno(repository);

        AlunoInfo alunoInfo = new AlunoInfo(cpf, nome, email);
        matricularAluno.executa(alunoInfo);
        System.out.println("Aluno salvo com sucesso!");
    }
}
