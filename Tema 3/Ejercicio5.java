  /* Escribe un programa que calcule el área de un rectángulo */     

public class Ejercicio5 {
    public static void main(String args[]) {
      Scanner area = new Scanner(System.in);
      System.out.println("Introduce la base: ");
      int base = area.nextInt();
      System.out.println("Introduce la altura: ");
      int altura = area.nextInt();
      System.out.println("El area el rectangulo es: " + (base * altura));
    }
}
