package br.com.gabriel.escola.app.aluno.matricular;

import br.com.gabriel.escola.dominio.aluno.Aluno;
import br.com.gabriel.escola.dominio.aluno.AlunosRepository;
import br.com.gabriel.escola.infra.aluno.AlunosRepositoryEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        AlunosRepository repository = new AlunosRepositoryEmMemoria();
        MatricularAluno ma = new MatricularAluno(repository);

        AlunoInfo alunoInfo = new AlunoInfo("123.456.789-00", "Gabriel", "gabriel@email.com");
        ma.executa(alunoInfo);

        Aluno aluno = repository.buscaPorCpf("123.456.789-00");
        assertEquals("123.456.789-00", aluno.getCpf());
        assertEquals("Gabriel", aluno.getNome());
        assertEquals("gabriel@email.com", aluno.getEmail());
    }
}