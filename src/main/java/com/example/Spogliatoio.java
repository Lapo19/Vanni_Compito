package com.example;

public class Spogliatoio {
    private int num = 2;

        public synchronized int entraSpogliatoio (Pilota p){
            String name = Thread.currentThread().getName();
            try {
                while(num==0)
                {
                    System.out.println("Spogliatoio pieno " + name + " aspetta");
                   wait();
                }
                System.out.println(name + " entra nello spogliatoio");
                num--;
                
            }catch  (InterruptedException e) { }
            return num;
        }
        public synchronized void esciSpogliatoio() {
            String name = Thread.currentThread().getName();
            num++;
            System.out.println(name + " esce dallo spogliatoio");
            notifyAll();
        }
}
