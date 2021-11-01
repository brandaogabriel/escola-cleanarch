package br.com.gabriel.escola.app.indicacao;

import br.com.gabriel.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
