/* Escribe un programa que calcule el área de un triángulo. */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
      Scanner trian = new Scanner(System.in);
      System.out.println("Introduce la base: ");
      int base1 = trian.nextInt();
      System.out.println("Introduce la altura: ");
      int altura1 = trian.nextInt();
      System.out.println("El area del triangulo es: " + (base1 * altura1 /2 )); 
    }
}
