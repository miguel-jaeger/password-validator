package com.ejemplo.security.servicio;

import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    // Min 8, max 16, al menos una mayúscula, un número y un caracter especial
    private static final String PASSWORD_PATTERN =
            "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!¡?*._-]).{8,16}$";

    public boolean esPasswordValido(String password) {
        if (password == null) {
            return false;
        }
        return password.matches(PASSWORD_PATTERN);
    }
}