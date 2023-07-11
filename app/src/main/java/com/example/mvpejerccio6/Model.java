package com.example.mvpejerccio6;

public class Model {
    public static final int WEAK = 0;
    public static final int MEDIUM = 1;
    public static final int STRONG = 2;

    public int checkingPasswords(String passwords) {
        if (passwords.length() < 5) {
            return WEAK;
        } else if (passwords.equals(passwords.toLowerCase())) {
            return MEDIUM;
        } else {
            return STRONG;
        }

    }
}