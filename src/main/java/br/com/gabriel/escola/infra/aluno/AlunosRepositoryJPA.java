package br.com.gabriel.escola.infra.aluno;

import br.com.gabriel.escola.dominio.aluno.Aluno;
import br.com.gabriel.escola.dominio.aluno.AlunosRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class AlunosRepositoryJPA implements AlunosRepository {

    private EntityManager entityManager;

    public AlunosRepositoryJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void matricular(Aluno aluno) {
        //TODO
    }

    @Override
    public Aluno buscaPorCpf(String cpf) {
        //TODO
        return null;
    }

    @Override
    public List<Aluno> listaTodosAlunosMatriculados() {
        //TODO
        return null;
    }
}
