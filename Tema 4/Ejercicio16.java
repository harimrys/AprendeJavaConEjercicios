/* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo 
infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. 
Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        System.out.println("Test de infidelidad, responde con true o false");
        //Primera pregunta
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
        Boolean a = sc.nextBoolean();
        if (a == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Segunda pregunta
        System.out.println("Ha aumentado sus gastos de vestuario?");
        Boolean b = sc.nextBoolean();
        if (b == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Tercera pregunta
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti?");
        Boolean c = sc.nextBoolean();
        if(c == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Cuarta pregunta
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        Boolean d = sc.nextBoolean();
        if(d == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Quinta pregunta
        System.out.println("No te deja que mires la agenda de su teléfono móvil?");
        Boolean e = sc.nextBoolean();
        if(e == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Sexta pregunta
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
        Boolean f = sc.nextBoolean();
        if(f == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Septima pregunta
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
        Boolean g = sc.nextBoolean();
        if(g == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Octava pregunta
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
        Boolean h = sc.nextBoolean();
        if(h == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Novena pregunta
        System.out.println("Has notado que últimamente se perfuma más?");
        Boolean i = sc.nextBoolean();
        if(i == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        //Decima pregunta
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
        Boolean j = sc.nextBoolean();
        if(j == true){
            count += 3;
        } else {
            System.out.println("vale");
        }
        System.out.println();
        
        System.out.println(count);
        System.out.println();
        
        if(count >= 0 && count <= 10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        else if(count > 10 && count < 22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        else if(count > 22 && count < 30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
