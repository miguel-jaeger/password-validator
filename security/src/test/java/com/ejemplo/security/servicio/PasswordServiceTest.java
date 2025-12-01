package com.ejemplo.security.servicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordServiceTest {

    private final PasswordService passwordService = new PasswordService();

    @Test
    void passwordValido_debeRetornarTrue() {
        String password = "Abcdef1!";
        assertTrue(passwordService.esPasswordValido(password));
    }

    @Test
    void sinMayusculas_debeRetornarFalse() {
        String password = "abcdef1!";
        assertFalse(passwordService.esPasswordValido(password));
    }

    @Test
    void sinNumero_debeRetornarFalse() {
        String password = "Abcdefg!";
        assertFalse(passwordService.esPasswordValido(password));
    }

    @Test
    void sinCaracterEspecial_debeRetornarFalse() {
        String password = "Abcdef12";
        assertFalse(passwordService.esPasswordValido(password));
    }

    @Test
    void muyCorto_debeRetornarFalse() {
        String password = "Ab1!";
        assertFalse(passwordService.esPasswordValido(password));
    }

    @Test
    void muyLargo_debeRetornarFalse() {
        String password = "Abcdjklmn1!";
        assertFalse(passwordService.esPasswordValido(password));
    }
}
