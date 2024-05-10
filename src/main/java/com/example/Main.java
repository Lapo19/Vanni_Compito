package com.example;

public class Main {
    public static void main(String[] args) {
        Spogliatoio spogliatoio = new Spogliatoio();
        Pista pista = new Pista();

        String[] nomi = {"Giulia", "Martina", "Pietro","Lorenzo","Marco","Francesco","Flavio","Viola"};

        for(int i=0;i<nomi.length;i++){
            Pilota t = new Pilota(nomi[i], spogliatoio, pista);
            t.start();
        }
    }
}