package com.example;

public class Pista {
    private int num = 4;

    public synchronized int entraPista (Pilota p){
        try {
            while(num==0)
            {
                System.out.println("Pista piena " + p.getNam() + " aspetta");
               wait();
            }
            num--;
            System.out.println(p.getNam() + " entra in pista ");
            
        }catch  (InterruptedException e) { }
        return num;
    }
    
    public synchronized void esciPista(int g, Pilota p) {
        num++;
        System.out.println(p.getNam() + " esce dalla pista ed ha fatto " + g/1000 + " giri");
        notifyAll();
    }

}
