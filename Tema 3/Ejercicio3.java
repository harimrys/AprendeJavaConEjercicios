/* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado. */

public class Ejercicio3 {
    public static void main(String args[]) {
      Scanner peseta = new Scanner(System.in);
      double euros1 = 0.006;
      System.out.println("Ingresa la cantidad en pesetas: ");
      double pesetas1 = peseta.nextDouble();
      System.out.println("En euros es: " + pesetas1 * euros1);
    }
}
