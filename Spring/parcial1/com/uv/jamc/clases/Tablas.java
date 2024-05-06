package com.uv.jamc.clases;


public class Tablas {
    public void mostrar(int input){
        for(int i = 1; i <= 10; i++){
            int mult = input * i;
            System.out.println(i + ".-" + input + "X" + i + "="+mult);
        }
    }


}
