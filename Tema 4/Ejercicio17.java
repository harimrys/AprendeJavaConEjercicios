/* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado. */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        
        int ultimoNumero = a % 10; //El resto de dividir un numero entre 10 es el ultimo digito del numero
        
        System.out.println("El ultimo numero es: " + ultimoNumero);
    }
}
