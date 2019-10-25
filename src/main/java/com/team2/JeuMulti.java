package com.team2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
*
* C'est la classe qui va permettre de faire lancer le jeu et d'y jouer.
*
* @version 1.0
*
* @see JeuSolo
* @author Ousmane Diarra
*/
public class JeuMulti extends AJeu {

    /**
     * Lance le jeu.
     *
     * @see lancerJeu
     * @author Ousmane Diarra
     * @throws IOException
     * 			IOexceptoin
     */
    public void lancerJeu(){
        final List<Joueur> lstJoueur = new ArrayList<Joueur>();
        final int dif = menu.selectDifficulte();
        final DictionnaireDeMotFactory.TypeJeu typeJeu = menu.demandeJeu();
        final DictionnaireDeMotFactory.TypeListe typeDico = menu.demandeEndroitDictionnaire();

        System.out.println("Veuillez entrer le nombre de joueur :\n");
        final int nbJoueur = menu.choixNombre();
        final Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nbJoueur; i++) {
            System.out.println("Veuillez entrer le nom du joueur " + (i + 1) + " :");
            if (scan.hasNextLine()) {
                final String nom = scan.nextLine();
                lstJoueur.add(Joueur.setJoueur(nom, dif == 1 ? 10 : 20, true));
            }
        }
        while (lstJoueur.stream().filter(j -> j.isActive()).count() > 1) {
            final IDictionnaireDeMot dic = DictionnaireDeMotFactory.creerInstance(typeDico,
                    typeDico == DictionnaireDeMotFactory.TypeListe.Fichier ? menu.demandeNomFichier() : "");
            final String mot = dif == 1 ? dic.getMotFacile() : dic.getMotDur();
            final ADictionnaireDeMot jeu = DictionnaireDeMotFactory.ChoisirJeu(typeJeu);
            System.out.println("Vous etes en mode " + (dif == 1 ? "debutant\n" : "avance\n"));

            System.out.println("le mot contient " + mot.length() + " lettres");
            for (final Joueur joueur : lstJoueur.stream().filter(j -> j.isActive()).collect(Collectors.toList())) {
                System.out.println("A vous de jouer " + joueur.getNom());
                for(int clear = 0; clear < 1000; clear++) {
                    System.out.println("\n") ;
                }
                if (jeu.verificationLettre(mot)) {
                    System.out.println("Vous avez trouver le bon mot " + joueur.getNom() + ", felicitations !!\n");
                } else {
                    System.out.println("Dommage " + joueur.getNom() + " tu as perdu !! " );
                    joueur.setActive(false);
                }
            }
        }
        if(lstJoueur.stream().filter(j -> j.isActive()).count() == 0) {
            System.out.println("Personne n'a gagné je vous ai battu");
        } else {
            System.out.println("Felicitation " + lstJoueur.stream().filter(j -> j.isActive()).findFirst().get().getNom() + " tu es le grand gagnant de cette partie !!!");
        }
    }
}
