package com.example;

public class Pilota extends Thread{
    private Spogliatoio spogliatoio;
    private int num;
    private Pista pista;

    public Pilota(int num, Spogliatoio spogliatoio, Pista pista){
        this.num = num;
        this.spogliatoio = spogliatoio;
        this.pista = pista;
    }
    
    @Override
    public void run(){
        try{
            spogliatoio.entraSpogliatoio(this);
            Thread.sleep(2000);//Ho messo un tempo di attesa per far mettere ai piloti la tuta
            pista.entraPista(this);
            int temp = 1000 + (int) (Math.random()*1000);
            Thread.sleep(temp*5);
            pista.esciPista();
            spogliatoio.esciSpogliatoio();
            
        }catch(InterruptedException i){
            i.printStackTrace();
        }
    }
}
    

