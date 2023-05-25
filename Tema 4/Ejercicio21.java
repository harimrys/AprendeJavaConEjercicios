/* Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las 
dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos 
controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. 
En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen 
de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, 
la nota será un 5; en caso contrario, se mantiene la nota media anterior. */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota del primer examen: ");
        double a = sc.nextDouble();
        
        System.out.print("Nota del segundo examen: ");
        double b = sc.nextDouble();
        
        double notaMedia = (a + b) / 2;
        
        if(notaMedia >= 5){
            System.out.println("Tu nota media es: " + notaMedia);
        } else {
            System.out.print("Cual fue el resultado de la recuperacion? (apto/no apto) ");
            String c = sc.next();
            if(c.equals("apto")){
                System.out.println("Tu nota es 5");
            } else {
                System.out.println("Tu nota es: " + notaMedia);
            }
        }
    }
}
