/*
 * TP_0 addition
 * 13 septembre 2023
 */
package tp_addition;

import java.util.Scanner;

/**
 *
 * @author De la asuncion
 */
public class TP_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice
// initialisation
Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
nb=sc.nextInt();
result=0;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
result=result+ind;
ind++;
}
// affichage du resultat
System.out.println("la somme des "+ nb + " entiers est : "+result); 
    }
    
}
