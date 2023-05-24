/* Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5. */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int a = sc.nextInt();
        
        if((a % 2 == 0) && (a % 5 == 0)){
            System.out.println("El numero es par y divisible por 5");
        }
        else if(a % 2 == 0){
            System.out.println("El numero es par");
        }
        else if (a % 5 == 0){
            System.out.println("El numero solo es divisible por 5");
        }
    }
}
