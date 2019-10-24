package com.team2;

import java.util.List;

public abstract class ADictionnaireDeMot{

    public List<String> listMots;

    final protected Menu menu = new Menu();

    public abstract boolean verificationLettre(final String mot);


    /**
     * Verifie si on a trouver le mot completement ou si il reste encore des mots a touver
     *
     * @see estComplet
     * @author Ousmane Diarra
     * @param char[] un tableau de caractere
     * @return trouve
     */
    public boolean estComplet(final List<Character> LettresTrouve) {
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
        return new String(motTab).contains(String.valueOf(lettre));
    }

    /**
     * Affiche les lettres
     *
     * @see affichage
     * @author Mael Veron
     * @param char[] lettreAtrouver
     */
    public void affichage(final List<Character> lettreAtrouver) {
        final StringBuilder affichage = new StringBuilder();
        for (int i = 0; i < lettreAtrouver.size(); i++) {
            affichage.append(String.valueOf(lettreAtrouver.get(i) + " "));
        }
        System.out.println(affichage.toString());
    }
}
