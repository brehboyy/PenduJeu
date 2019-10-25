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
     * @see main
     * @author Mael Veron
     * @param args
     * 		Argument pour les args
     */
    public static void main(final String... args) {
        final Menu menu = new Menu();
        final DictionnaireDeMotFactory.TypeMode typeModeJeu = menu.selectMode();
        final AJeu nouveauJeu = DictionnaireDeMotFactory.choisirMode(typeModeJeu);
        nouveauJeu.lancerJeu();
    }

}
