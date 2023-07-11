package com.example.mvpejerccio6;

public class Presenter {

    private Model modelo;
    private ViewPresentador viewPresentador;

    public Presenter(ViewPresentador viewPresentador) {

        this.viewPresentador = viewPresentador;
        modelo = new Model();
    }


    public void evaluarContraseña(String password) {
        int nivel = modelo.checkingPasswords(password);


        if (nivel == modelo.WEAK) {
            this.viewPresentador.showDebil();

        } else if (nivel == modelo.MEDIUM) {
            this.viewPresentador.showMedia();


        } else if (nivel == modelo.STRONG) {
            this.viewPresentador.showFuerte();

        }else{
            this.viewPresentador.showError();
        }
    }
}


