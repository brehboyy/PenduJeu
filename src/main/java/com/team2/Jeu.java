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

    /**
     * Lance le jeu
     *
     * @see LancerJeu
     * @author Mael Veron
     */
    public void lancerJeu() {

        final Menu menu = new Menu();
        final int dif = menu.accueil();
        final DictionnaireDeMotFactory.Type typeDico = menu.demandeEndroitDictionnaire();
        String mot = "";

        String nomFichier="";
        if(typeDico == DictionnaireDeMotFactory.Type.Fichier) {
            nomFichier = menu.demandeNomFichier();
        }

        final DictionnaireDeMot dic = DictionnaireDeMotFactory.creerInstance(typeDico, nomFichier);

        if (dif == 1) {
            System.out.println("Vous etes en mode debutant\n");
            mot = dic.getMotFacile();
        } else if (dif == 2) {
            System.out.println("Vous etes en mode avance\n");
            mot = dic.getMotDur();
        }
        System.out.println("le mot contient " + mot.length() + " lettres");

        if (verificationLettre(mot)) {
            System.out.println("Vous avez trouver le bon mot, felicitations !!");
        } else {
            System.out.println("Vous vous etes trompe, dommage...");
        }

        System.out.println("Le mot etait " + mot);
    }

    /**
     * Verifie les lettres dans le mot
     *
     * @see VerificationLettre
     * @author Mael Veron
     * @param String mot le mot genere
     * @return reussite
     */
    public boolean verificationLettre(final String mot) {
        final Menu menu = new Menu();
        final char[] motLettre = mot.toCharArray();
        final char[] lettreAtrouver = new char[motLettre.length];

        for (int i = 0; i < motLettre.length; i++) {
            lettreAtrouver[i] = '_';
        }

        int essai = 0;
        boolean reussite = false;
        affichage(lettreAtrouver);

        while (!reussite && essai < 10) {
            final char lettre = menu.choixLettre().charAt(0);
            if (estDansMot(lettre, motLettre)) {
                for (int i = 0; i < motLettre.length; i++) {
                    if (motLettre[i] == lettre) {
                        lettreAtrouver[i] = lettre;
                    }
                }
                DessinPendu.afficherEtapesPerdu(essai);
            }else {
                essai++;
                DessinPendu.afficherEtapesPerdu(essai);
            }
            reussite = estComplet(lettreAtrouver);
            affichage(lettreAtrouver);
            System.out.println("Il vous reste " + (10-essai) +" essai(s)");
        }
        return reussite;
    }


    /**
     * Verifie si on a trouver le mot completement ou si il reste encore des mots a touver
     *
     * @see estComplet
     * @author Ousmane Diarra
     * @param char[] un tableau de caractere
     * @return trouve
     */
    public boolean estComplet(final char... LettresTrouve) {
        boolean trouve = true;
        for(final char c : LettresTrouve) {
            if(c == '_') {
                trouve = false;
            }
        }
        return trouve;
    }


    /**
     * Verifie Verifie si une lettre est dans un mot
     *
     * @see estDansMot
     * @author Ousmane Diarra
     * @param char lettre a verifier
     * @param char[] un tableau de caractere
     * @return boolean
     */
    public boolean estDansMot(final char lettre, final char... motTab) {
        return new String(motTab).contains(lettre + "");
    }

    /**
     * Affiche les lettres
     *
     * @see affichage
     * @author Mael Veron
     * @param char[] lettreAtrouver
     */
    public void affichage(final char... lettreAtrouver) {
        final StringBuilder affichage = new StringBuilder();
        for (int i = 0; i < lettreAtrouver.length; i++) {
            affichage.append(lettreAtrouver[i] + " ");
        }
        System.out.println(affichage.toString());
    }
}