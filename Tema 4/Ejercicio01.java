/* Escribe un programa que pida por teclado un día de la semana y que diga qué 
asignatura toca a primera hora ese día. */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un dia de la semana");
        String dia = sc.nextLine();
        
        switch(dia){
            case "lunes":
                System.out.println("Hoy es lunes!");
                break;
            
            case "martes":
                System.out.println("Hoy es martes!");
                break;
            
            case "miercoles":
                System.out.println("Hoy es miercoles!");
                break;
            
            case "jueves":
                System.out.println("Hoy es jueves");
                break;

            case "viernes":
                System.out.println("Hoy es viernes BIEEEEN!");
                break;

            case "sabado":
                System.out.println("Hoy es sabado!!");
                break;

            case "domingo":
                System.out.println("Oh no! hoy es domingo :(");
                break;
            
            default:
                System.out.println("Introduce un dia de la semana valido");
        } 
    }
}
