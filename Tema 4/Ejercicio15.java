/* Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha. */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una letra o simbolo para hacer una piramide: ");
        String a = sc.nextLine();
        
        System.out.println("Elige una forma:");
        System.out.println("1. Piramide hacia arriba");
        System.out.println("2. Piramide hacia abajo");
        System.out.println("3. Piramide hacia la derecha");
        System.out.println("4. Piramide hacia la izquierda");
        
        int opcion = sc.nextInt();
        switch(opcion){
            case 1: //hacia arriba
                System.out.println("   " + a + "   ");
                System.out.println("  " + a + a + a);
                System.out.println(" " + a + a + a + a + a);
                break;
            
            case 2: //hacia abajo
                System.out.println(" " + a + a + a + a + a);
                System.out.println("  " + a + a + a);
                System.out.println("   " + a + "   ");
                break;
            
            case 3: //hacia la derecha
                System.out.println(a);
                System.out.println(a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println(a + " " + a);
                System.out.println(a);
                break;
            
            case 4: //hacia la izquierda
                System.out.println("    " + a);
                System.out.println("  " + a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println("  " + a  + " " + a);
                System.out.println("    " + a);
                break;
        }
    }
}
