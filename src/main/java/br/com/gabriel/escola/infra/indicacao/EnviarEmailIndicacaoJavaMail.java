package br.com.gabriel.escola.infra.indicacao;

import br.com.gabriel.escola.app.indicacao.EnviarEmailIndicacao;
import br.com.gabriel.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        System.out.println("Sending e-mail to: " + indicado.getNome());
        System.out.println("Provider: JavaMail");
    }
}
