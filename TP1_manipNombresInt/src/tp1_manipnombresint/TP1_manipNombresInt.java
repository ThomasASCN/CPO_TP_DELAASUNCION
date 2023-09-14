/*
 * TP1_manipNombresInt
 * 13 septembre 2023
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author De la asuncion
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
        int nb2; // nombre d'entiers à additionner
        
Scanner sc = new Scanner(System.in); 
System.out.println("Entrer 2 nombres :"); // choix de 2 nombres
nb=sc.nextInt();
nb2=sc.nextInt();


        int somme = nb + nb2; // adddition
        int soustraction = nb - nb2; // soustraction 
        int division = nb/nb2; // quotient entier de la division
        int reste = nb%nb2; // reste de la division
      
      System.out.println("La somme des deux nombres entrés est : "+ somme + " la soustraction est " + soustraction + " le quotient est " + division +" le reste est de " + reste);
      
       
   
    }
    }
    

