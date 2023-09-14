/*
 * TP0 Exercice
 * 13 Septembre 2023
 */
package tp0_helloworld;

import java.util.Scanner;

/**
 *
 * @author De la asuncion
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println( " Bonjour " ) ;
       System.out.println( " Au revoir " ) ;
      String prenom;
Scanner sc ;
sc = new Scanner (System.in) ;
System.out.println("Quel est votre prénom ?");
prenom = sc.nextLine();
System.out.println( " Au revoir " + prenom ) ;
    }
    
}
