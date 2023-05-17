/* Escribe un programa que declare 5 variables de tipo char. A continuación, crea otra variable como cadena 
de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la 
cadena de caracteres por pantalla */

public class Ejercicio8 {
    public static void main(String args[]) { 
      char uno = 'H';
      char dos = 'o';
      char tres = 'l';
      char cuatro = 'a';
      String todas = "" + uno + dos + tres + cuatro; //al añadir "" al principio se concatena como una string 
      System.out.println(todas);
    }
}
