/* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
convertir debe ser introducida por teclado. */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner euros = new Scanner(System.in);
        double pesetas = 166.386;
        System.out.println("Ingresa la cantidad en euros: ");
        int euro = euros.nextInt();
        System.out.println("En pesetas son: " + euro * pesetas); 
    }
}
