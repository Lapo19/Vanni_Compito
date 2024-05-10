package com.example;

public class Pista {
    private int num = 4;

    public synchronized int entraPista (Pilota p){
        String name = Thread.currentThread().getName();
        try {
            while(num==0)
            {
                System.out.println("Pista piena " + name + " aspetta");
               wait();
            }
            num--;
            System.out.println("Entra in pista " + name);
            
        }catch  (InterruptedException e) { }
        return num;
    }
    
    public synchronized void esciPista() {
        String name = Thread.currentThread().getName();
        num++;
        System.out.println(name + " esce dalla pista");
        notifyAll();
    }

}
