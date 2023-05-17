/* Escribe un programa que sume, reste, multiplique y divida dos números 
introducidos por teclado. */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
      Scanner num = new Scanner(System.in);
      System.out.println("Introuce dos numeros: ");
      int a = num.nextInt();
      int b = num.nextInt();
      System.out.println("La suma de los dos numeros es: " + (a + b));
      System.out.println("La resta de los dos numeros es: " + (a - b));
      System.out.println("La multiplicacion de los dos numeros es: " + (a * b));
      System.out.println("La division de los dos numeros es: " + (a / b));
    }
}
