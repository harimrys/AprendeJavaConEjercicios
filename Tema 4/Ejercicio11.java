/* Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche. */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una hora: ");
        int hora = sc.nextInt();
        
        System.out.print("Introduce los minutos: ");
        int min = sc.nextInt();
        
        int segundos = (hora * 3600) + (min * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundos;
        
        System.out.println("Son las " + hora + ":" + min + " hasta medianoche faltan " + segundosHastaMedianoche + " segundos.");
    }
}
