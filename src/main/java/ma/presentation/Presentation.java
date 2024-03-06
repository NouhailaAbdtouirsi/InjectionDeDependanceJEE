package ma.presentation;

import ma.dao.DaoImpl;
import ma.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        // instancier la classe MetierImpl ,injecter une instance de DaoImpl par instanciation statique
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl());
        // afficher le resultat
        System.out.println("Resultat : "+metier.calcul());
    }
}
