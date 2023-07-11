package com.example.mvpejerccio6;

public class Presentador {

    private Modelo modelo;
    private ViewPresentador viewPresentador;

    public Presentador(ViewPresentador viewPresentador) {

        this.viewPresentador = viewPresentador;
        modelo = new Modelo();
    }


    public void evaluarContraseña(String password) {
        int nivel = modelo.checkingPasswords(password);


        if (nivel == modelo.DEBIL) {
            this.viewPresentador.showDebil();

        } else if (nivel == modelo.MEDIA) {
            this.viewPresentador.showMedia();


        } else if (nivel == modelo.FUERTE) {
            this.viewPresentador.showFuerte();

        }else{
            this.viewPresentador.showError();
        }
    }
}


