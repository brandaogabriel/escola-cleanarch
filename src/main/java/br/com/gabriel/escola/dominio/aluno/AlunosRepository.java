package br.com.gabriel.escola.dominio.aluno;

import java.util.List;

public interface AlunosRepository {

    void matricular(Aluno aluno);

    Aluno buscaPorCpf(String cpf);

    List<Aluno> listaTodosAlunosMatriculados();
}
