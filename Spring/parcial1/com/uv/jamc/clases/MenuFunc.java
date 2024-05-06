package com.uv.jamc.clases;

import java.util.Scanner;

public class MenuFunc {
    public void switchCase(int input){
        switch (input) {
            case 1:
                System.out.println("Opción Mostrar tabla");
                break;
            case 2:
                System.out.println("Mostrar tablas del 2 al 5");
                break;
            case 3:
                System.out.println("Saliendo");
            default:
                System.out.println("Ingrese una opción correcta");
        }
    }

    public void opcion1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la tabla a mostrar");
        int num = input.nextInt();
        Tablas tablas = new Tablas();
        tablas.mostrar(num);
    }

    public void opcion2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tablas del 2 al 5");
        Tablas tablas = new Tablas();
        tablas.mostrar(2);
        tablas.mostrar(3);
        tablas.mostrar(4);
        tablas.mostrar(5);
    }
}
