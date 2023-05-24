/* Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento. */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Introduce tu mes de nacimiento: ");
        int mes = sc.nextInt();
        
        switch(mes){
            case 1: //enero
                if(dia < 20){
                    System.out.println("Eres capricornio");
                } else {
                    System.out.println("Eres acuario");
                }
                break;
            
            case 2: //febrero
                if(dia < 19){
                    System.out.println("Eres acuario");
                } else {
                    System.out.println("Eres piscis");
                }
                break;
            
            case 3: //marzo
                if(dia < 21){
                    System.out.println("Eres piscis");
                } else {
                    System.out.println("Eres aries");
                }
                break;
            
            case 4: //abril
                if(dia < 20){
                    System.out.println("Eres aries");
                } else {
                    System.out.println("Eres tauro");
                }
                break;
                
            case 5: //mayo
                if(dia < 21){
                    System.out.println("Eres tauro");
                } else {
                    System.out.println("Eres geminis");
                }
                break;
            
            case 6: //junio
                if(dia < 21){
                    System.out.println("Eres geminis");
                } else {
                    System.out.println("Eres cancer");
                }
                break;
                
            case 7: //julio
                if(dia < 23){
                    System.out.println("Eres cancer");
                } else {
                    System.out.println("Eres leo");
                }
                break;
            
            case 8: //agosto
                if(dia < 23){
                    System.out.println("Eres leo");
                } else {
                    System.out.println("Eres virgo");
                }
                break;
            
            case 9: //septiembre
                if(dia < 23){
                    System.out.println("Eres virgo");
                } else {
                    System.out.println("Eres libra");
                }
                break;
                
            case 10: //octubre
                if(dia < 23){
                    System.out.println("Eres libra");
                } else {
                    System.out.println("Eres escorpio");
                }
                break;
                
            case 11: //noviembre
                if(dia < 22){
                    System.out.println("Eres escorpio");
                } else {
                    System.out.println("Eres sagitario");
                }
                break;
            
            case 12: //diciembre
                if(dia < 22){
                    System.out.println("Eres sagitario");
                } else {
                    System.out.println("Eres capricornio");
                }
                break;
            
            default:
                System.out.println("Escribe un mes valido");
        }
    }
}
