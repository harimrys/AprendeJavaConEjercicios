/* Escribe un programa que calcule el salario semanal de un empleado en base 
a las horas trabajadas, a razón de 12 euros la hora. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
      Scanner trabajo = new Scanner(System.in);
      int salario = 12;
      System.out.println("Introduce las horas trabajadas esta semana: ");
      int horas = trabajo.nextInt();
      System.out.println("Esta semana cobras: " + (horas * salario) + "€");
    }
}
