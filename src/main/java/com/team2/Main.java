package com.team2;

/**
*
* La classe principale qui va tout initialiser.
*
* @version 1.0
*
* @see Main
* @author Ousmane Diarra
*/
public final class Main {


    /**
     * Constructeur de la classe.
     *
     * @see Main
     * @author Mael Veron
     */
    private Main() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Point d'entr�e du programme.
     *
     * @see accueil
     * @author Mael Veron
     * @param String arguments
     */
    public static void main(final String... args) {
        final Jeu nouveauJeu = new Jeu();
        nouveauJeu.lancerJeu();
    }

}
