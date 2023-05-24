/* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0) */

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        
        if(a == 0){
            System.out.println("Esta ecuación no tiene solución");
        } else {
            double ecuacion = -b/a;
            System.out.println("x = " + ecuacion);
        }
    }
}
