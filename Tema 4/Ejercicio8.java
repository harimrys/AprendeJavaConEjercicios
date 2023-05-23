/* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */

import java.util.Scanner;

public class Ejercicio7 {
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
        
        if(media < 5){
            System.out.println("Insuficiente");
        }
        else if((media >= 5) && (media < 6)){
            System.out.println("Suficiente"); //calcula el 5 con decimales hasta llegar al 5.99 incluido
        }
        else if((media >= 6) && (media < 7)){  //calcula el 6 con decimales hasta llegar a 6.99
            System.out.println("Bien");
        }
        else if((media >= 7) && (media < 9)){
            System.out.println("Notable");
        }
        else if(media >= 9){
            System.out.println("Notable");
        }
    }
}
