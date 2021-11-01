package br.com.gabriel.escola;

import br.com.gabriel.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678"));
    }
}