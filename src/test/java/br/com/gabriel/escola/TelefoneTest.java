package br.com.gabriel.escola;

import br.com.gabriel.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComDDDInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefonesComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("83", null));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("83", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("83", "1234567"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("83", "1234567890"));
    }
}