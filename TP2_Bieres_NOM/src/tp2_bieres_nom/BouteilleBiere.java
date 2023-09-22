/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_nom;

/**
 *
 * @author De la asuncion
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie ) ;
}

  
}
