/* Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. 
El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa 
o chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar 
la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o 
blanco; la primera opción vale 14 euros y la segunda 15. Por último se pregunta si se 
añade nata y si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75. */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double precioSabor = 0;
        double precioNata = 0;
        double precioNombre = 0;
        
        
        System.out.print("Elije un sabor manzana, fresa o chocolate: ");
        String sabor = sc.next();
        
        if(sabor.equals("manzana")){
            precioSabor = 18;
            System.out.println("Tarta de manzana: " + precioSabor + "€");
        }
        else if(sabor.equals("fresa")){
            precioSabor = 16;
            System.out.println("Tarta de fresa: " + precioSabor + "€");
        }
        else if(sabor.equals("chocolate")){
            System.out.print("Que tipo de chocolate? negro o blanco: ");
            String choco = sc.next();
            if(choco.equals("negro")){
                precioSabor = 14;
                System.out.println("Tarta de chocolate negro: " + precioSabor + "€");
            } 
            else if(choco.equals("blanco")){
                precioSabor = 15;
                System.out.println("Tarta de chocolate blanco: " + precioSabor + "€");
            }
        }
        
        System.out.print("Quieres nata? ");
        String nata = sc.next();
        if(nata.equals("si")){
            precioNata = 2.50;
            System.out.println("Con nata: " + precioNata + "€");
        }
        
        System.out.print("Quieres ponerle un nombre? ");
        String nombre = sc.next();
        if(nombre.equals("si")){
            precioNombre = 2.75;
            System.out.println("Con nombre: " + precioNombre + "€");
        }
        
        System.out.print("Total: ");
        System.out.println(precioSabor + precioNata + precioNombre);
    }
}
