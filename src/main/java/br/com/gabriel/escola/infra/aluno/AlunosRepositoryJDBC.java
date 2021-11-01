package br.com.gabriel.escola.infra.aluno;

import br.com.gabriel.escola.dominio.aluno.Aluno;
import br.com.gabriel.escola.dominio.aluno.AlunosRepository;

import java.sql.Connection;
import java.util.List;

public class AlunosRepositoryJDBC implements AlunosRepository {

    private Connection connection;

    public AlunosRepositoryJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        //TODO Salva um aluno no banco de dados
    }

    @Override
    public Aluno buscaPorCpf(String cpf) {
        //TODO Retorna um aluno a partir do seu cpf
        return null;
    }

    @Override
    public List<Aluno> listaTodosAlunosMatriculados() {
        //TODO Retorna todos os alunos matriculados
        return null;
    }
}
