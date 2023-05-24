/* Escribe un programa que ordene tres números enteros introducidos por teclado. */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int a = sc.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        
        System.out.print("Ingresa el tercer numero: ");
        int c = sc.nextInt();
        
        if(a > b && b > c){
            System.out.println("Mayor a menor: " + a + " " + b + " " + c);
        }
        else if(a > c && c > b){
            System.out.println("Mayor a menor: " + a + " " + c + " " + b);
        }
        else if(b > a && a > c){
            System.out.println("Mayor a menor: " + b + " " + a + " " + c);
        }
        else if(b > c && c > a){
            System.out.println("Mayor a menor: " + b + " " + c + " " + a);
        }
        else if(c > b && b > a){
            System.out.println("Mayor a menor: " + c + " " + b + " " + a);
        } else {
            System.out.println("Mayor a menor: " + c + " " + a + " " + b);
        }
    }
}
