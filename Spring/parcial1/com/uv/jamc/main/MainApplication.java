package com.uv.jamc.main;

import java.util.Scanner;

import com.uv.jamc.clases.Menu;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uv.jamc.clases.Tablas;

//@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//SpringApplication.run(MainApplication.class, args);
		System.out.println("Ola");
		Menu menu = new Menu();
		menu.msgMenu();
	}

}
