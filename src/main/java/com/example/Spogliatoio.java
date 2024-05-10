package com.example;

public class Spogliatoio {
    private int num = 2;

        public synchronized int entraSpogliatoio (Pilota p){
            try {
                while(num==0)
                {
                    System.out.println("Spogliatoio pieno " + p.getNam() + " aspetta");
                   wait();
                }
                System.out.println(p.getNam() + " entra nello spogliatoio");
                num--;
                
            }catch  (InterruptedException e) { }
            return num;
        }
        public synchronized void esciSpogliatoio(Pilota p) {
            num++;
            System.out.println(p.getNam() + " esce dallo spogliatoio");
            notifyAll();
        }
}
