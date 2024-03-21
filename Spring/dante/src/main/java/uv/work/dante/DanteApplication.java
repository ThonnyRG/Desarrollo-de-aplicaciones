//Exceute the code in terminal with ./gradlew.bat bootrun
//Use cd /Spring and the next /dante
package uv.work.dante;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class DanteApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DanteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        new Thread(() -> {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Escoge una opción");
                System.out.println("1.-Suma \\n2.-Resta\\n3.-Multiplicación\\n4.-División");
                int switchInput = input.nextInt();
                System.out.println("Digita un número:");
                int num1 = input.nextInt();
                System.out.println("Digita otro número:");
                int num2 = input.nextInt();
                menu(switchInput, num1, num2);
                System.out.println("Pollo");
            }
        }).start();
    }

    public void menu(int option, int num1, int num2){

        switch(option){
        case 1:
            System.out.println("La suma de " + num1 + " y " + num2 + "es: \n" + sum(num1, num2));
            break;
        case 2:
            System.out.println("La Resta de " + num1 + " y " + num2 + "es: \n" +  rest(num1, num2));
            break;
        case 3:
            System.out.println("La multiplicación de " + num1 + " y " + num2 + "es: \n" +  multi(num1, num2));
            break;
        case 4:
            System.out.println("División" + num1 + " y " + num2 + "es: \n" +  div(num1, num2));
            break;
        default:
            System.out.println("Ingresa una opción correcta");
        }
    }
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int rest(int num1, int num2){
        return num1-num2;
    }
    public static int multi(int num1, int num2){
        return num1*num2;
    }
    public static int div(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }else{
        return num1/num2;
    }
    }
}
