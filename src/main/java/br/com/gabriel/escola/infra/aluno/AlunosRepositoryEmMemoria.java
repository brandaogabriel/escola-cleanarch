package br.com.gabriel.escola.infra.aluno;

import br.com.gabriel.escola.dominio.aluno.Aluno;
import br.com.gabriel.escola.dominio.aluno.AlunosRepository;

import java.util.ArrayList;
import java.util.List;

public class AlunosRepositoryEmMemoria implements AlunosRepository {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscaPorCpf(String cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Aluno com cpf informado não encontrado"));
    }

    @Override
    public List<Aluno> listaTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
