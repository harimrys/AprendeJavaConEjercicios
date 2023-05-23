/* Escribe un programa que calcule el salario semanal de un trabajador teniendo 
en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 
12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora. */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int eurHora = 12;
        int eurHoraExtra = 16;
        
        System.out.println("Introduce las horas trabajadas: ");
        int horas = sc.nextInt();
        
        if(horas <= 40){
            int salarioSemana = horas * eurHora;
            System.out.println("El salario de esta semana es: " + salarioSemana + "€");
        }
        else if(horas > 40){
            int horasExtra = (40 * eurHora) + ((horas - 40) * eurHoraExtra);
            System.out.println("El salario de esta semana es: " + horasExtra + "€");
        }
    }
}
