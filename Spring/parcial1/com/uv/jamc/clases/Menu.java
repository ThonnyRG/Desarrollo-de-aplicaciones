package com.uv.jamc.clases;

import java.util.Scanner;

/* 
 1) Mostrar una tabla, 2) Mostrar tablas del 2 al 5, 3) Salir
 */
public class Menu {
    public void msgMenu(){
        System.out.println("===MENU===");
        System.out.println("Ingresa una opción");
        System.out.println("1.-Mostrar tabla");
        System.out.println("2.-Mostrar tablas del 2 al 5");
        System.out.println("3.-Salir");
        MenuFunc menuFunc = new MenuFunc();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        menuFunc.switchCase(num);
    }
}
