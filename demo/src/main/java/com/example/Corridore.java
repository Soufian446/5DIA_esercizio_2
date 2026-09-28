package com.example;

public class Corridore extends Thread{
    String nome;

    public Corridore(String y){
        this.nome=y;
    }

    @Override
    public void run(){
        for(int i=1; i<6 ; i++){
            System.out.println(this.nome+" ha fatto il passo "+i);
            int n = (int)(Math.random() * (800 - 200)) +200;
            try {
                Thread.sleep(n);
            } catch (InterruptedException e) {
                System.out.println("Pausa interrotta");
            }
        }
        System.out.println(this.nome+" e' arrivato al traguardo");
    }
}
