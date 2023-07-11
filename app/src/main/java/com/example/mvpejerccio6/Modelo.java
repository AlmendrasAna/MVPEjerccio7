package com.example.mvpejerccio6;

public class Modelo {
    public static final int DEBIL = 0;
    public static final int MEDIA = 1;
    public static final int FUERTE = 2;

    public int checkingPasswords(String passwords) {
        if (passwords.length() < 5) {
            return DEBIL;
        } else if (passwords.equals(passwords.toLowerCase())) {
            return MEDIA;
        } else {
            return FUERTE;
        }

    }
}