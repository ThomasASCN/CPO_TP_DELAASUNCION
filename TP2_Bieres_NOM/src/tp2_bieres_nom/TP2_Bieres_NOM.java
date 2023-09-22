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
 BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson");
 uneBiere.lireEtiquette();
 BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe");
 autreBiere.lireEtiquette();
 
  BouteilleBiere autreBiere2 = new BouteilleBiere("86", (float) 8.6,"Carrefour");
 autreBiere2.lireEtiquette();
 autreBiere2.decapsuler();
 
 
  BouteilleBiere autreBiere3 = new BouteilleBiere("Heineken", (float) 5.5,"Auchan");
 autreBiere3.lireEtiquette();
 
 
  BouteilleBiere autreBiere4 = new BouteilleBiere("desperador", (float) 7.6,"Despe");
 autreBiere4.lireEtiquette();
 autreBiere4.decapsuler();
 
 System.out.println(uneBiere);
  System.out.println(autreBiere2);
   System.out.println(autreBiere3);
  System.out.println(autreBiere4);

    }
    
}
