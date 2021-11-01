package br.com.gabriel.escola.app.aluno.matricular;

import br.com.gabriel.escola.dominio.aluno.Aluno;
import br.com.gabriel.escola.dominio.aluno.AlunosRepository;

/**
 * Essa classe pode ser entendida como um "Usecase"
 */
public class MatricularAluno {

    private final AlunosRepository alunosRepository;

    public MatricularAluno(AlunosRepository alunosRepository) {
        this.alunosRepository = alunosRepository;
    }

    public void executa(AlunoInfo alunoInfo) {
        System.out.println("Salvando aluno...");
        Aluno aluno = alunoInfo.paraAluno();
        alunosRepository.matricular(aluno);
    }
}
