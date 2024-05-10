package com.example;

public class Pilota extends Thread{
    private Spogliatoio spogliatoio;
    private String name;
    private Pista pista;

    public Pilota(String name, Spogliatoio spogliatoio, Pista pista){
        this.name = name;
        this.spogliatoio = spogliatoio;
        this.pista = pista;
    }
    
    @Override
    public void run(){
        try{
            spogliatoio.entraSpogliatoio(this);
            Thread.sleep(2000);//Ho messo un tempo di attesa per far mettere ai piloti la tuta
            spogliatoio.esciSpogliatoio(this);
            pista.entraPista(this);
            int temp = 1000 + (int) (Math.random()*1000);
            int giri = 1000 +(int) (Math.random()*5000);//Ho messo un numero randomico di giri
            Thread.sleep(temp*(giri)/1000);//Ho messo che il tempo di attesa si moltiplicava per i giri
            pista.esciPista(giri,this);
            
        }catch(InterruptedException i){
            i.printStackTrace();
        }
    }

    public String getNam(){
        return name;
    }
}
    

