/* Realiza un programa que calcule la media de tres notas. */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce la segunda nota: ");
        double b = sc.nextDouble();
        
        System.out.print("Introduce la tercera nota: ");
        double c = sc.nextDouble();
        
        double media = (a + b + c) / 3;
        
        System.out.printf("La nota media es: %.2f \n", media);
    }
}
