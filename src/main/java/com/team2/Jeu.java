package com.team2;


/**
*
* C'est la classe qui va permettre de faire lancer le jeu et d'y jouer.
*
* @version 1.0
*
* @see Jeu
* @author Mael Verron
*/
public class Jeu {
    final private Menu menu;

    public Jeu() {
        this.menu = new Menu();
    }

    /**
     * Lance le jeu
     *
     * @see LancerJeu
     * @author Mael Veron
     */
    public void lancerJeu() {
        final int dif = menu.accueil();
        final DictionnaireDeMotFactory.TypeJeu typeJeu = menu.demandeJeu();
        final DictionnaireDeMotFactory.TypeListe typeDico = menu.demandeEndroitDictionnaire();
        String nomFichier="";
        if(typeDico == DictionnaireDeMotFactory.TypeListe.Fichier) {
            nomFichier = menu.demandeNomFichier();
        }

        final IDictionnaireDeMot dic = DictionnaireDeMotFactory.creerInstance(typeDico, nomFichier);
        final String mot = dif == 1 ? dic.getMotFacile() : dic.getMotDur();
        final ADictionnaireDeMot jeu = DictionnaireDeMotFactory.ChoisirJeu(typeJeu);
        System.out.println("Vous etes en mode " + (dif == 1 ? "debutant\n" : "avance\n"));

        System.out.println("le mot contient " + mot.length() + " lettres");

        if (jeu.verificationLettre(mot)) {
            System.out.println("Vous avez trouver le bon mot, felicitations !!");
        } else {
            System.out.println("Vous vous etes trompe, dommage...");
        }

        System.out.println("Le mot etait " + mot);
    }
}
