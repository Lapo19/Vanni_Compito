package com.example;

public class Main {
    public static void main(String[] args) {
        Spogliatoio spogliatoio = new Spogliatoio();
        Pista pista = new Pista();

        for(int i=1;i<8;i++){
            Pilota t = new Pilota(i, spogliatoio, pista);
            t.start();
        }
    }
}