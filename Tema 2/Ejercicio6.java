/* Escribe un programa que calcule el total de una factura a partir de la 
baseimponible (precio sin IVA). La base imponible estará almacenada en una variable. */

public class Ejercicio6 {
    public static void main(String args[]) { 
      double precio = 100;
      double iva = 1.21;
      double total = precio * iva;
      System.out.println(total);
    }
}
