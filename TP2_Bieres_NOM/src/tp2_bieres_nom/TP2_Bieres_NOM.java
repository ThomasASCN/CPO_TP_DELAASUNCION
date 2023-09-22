/*

 */
package tp2_bieres_nom;

/**
 *
 * @author De la asuncion
 */
public class TP2_Bieres_NOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 BouteilleBiere uneBiere = new BouteilleBiere();
uneBiere.nom = "Cuvée des trolls";
uneBiere.degreAlcool = (float)7.0;
uneBiere.brasserie = "Dubisson";
UneBiere.ouverte = false;
uneBiere.lireEtiquette();
    }
    
}
