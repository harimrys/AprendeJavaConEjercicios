/* Realiza un minicuestionario con 10 preguntas tipo test. Cada pregunta acertada 
sumará un punto. El programa mostrará al final la calificación obtenida. */

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        System.out.println("Cuanto sabes de Star Wars");
    
        //Primera pregunta
        System.out.println("Cuantos hijos tuvieron Anakin y Padme?");
        int a = sc.nextInt();
        
        if(a == 2){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
          //count--; para restar en la cuenta
        }
        System.out.println(); //para separar las preguntas
        
        //Segunda pregunta
        System.out.println("Con cuantos sables suele pelear Ahsoka?");
        int b = sc.nextInt();
        
        if(b == 2){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
          //count--;
        }
        System.out.println();
        
        //Tercera pregunta
        System.out.println("Como se llama el droide que usa Leia para pedir ayuda a Obi-wan?");
        String c = sc.next(); //al poner nextLine() no deja escribir la respuesta
        if(c.equals("r2d2")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Cuarta pregunta
        System.out.println("Que tipo de robot es R2?");
        String d = sc.next();
        if(d.equals("astromecanico")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Quinta pregunta
        System.out.println("Como se llama en realidad Baby Yoda?");
        String e = sc.next();
        if(e.equals("Grogu")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Sexta pregunta
        System.out.println("En que planeta vive Luke?");
        String f = sc.next();
        if(f.equals("Tatooine")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Septima pregunta
        System.out.println("Quien era Darth Vader antes de caer en el lado oscuro?");
        String g = sc.next();
        if(g.equals("Anakin")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Octava pregunta
        System.out.println("Que planeta destruyo la Estrella de la Muerte delante de Leia?");
        String h = sc.next();
        if(h.equals("Alderaan")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Novena pregunta
        System.out.println("Como se llama el droide astromecanico de Hera?");
        String i = sc.next();
        if(i.equals("Chopper")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        //Decima pregunta
        System.out.println("Que especie es Chewbacca?");
        String j = sc.next();
        if(j.equals("wookiee")){
            System.out.println("Bieen!");
            count++;
        } else {
            System.out.println("Oh oh! no es correcto");
        }
        System.out.println();
        
        System.out.println("Tu puntuacion es: " + count);
    }
}
