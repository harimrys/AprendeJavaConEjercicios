/* Realiza un programa que pida dos números y que luego muestre el 
resultado de su multiplicación. */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("La multiplicacion es: " + x * y);
    }
}
