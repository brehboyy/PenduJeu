package com.team2;

/**
 *
 * Cette classe va permettre d'afficher au fur et a mesure les differentes etapes du pendu
 *
 * @version 1.0
 *
 * @see DessinPendu
 * @author Ousmane Diarra
 */
public class DessinPendu {


	/**
     * Constructeur de la classe
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private DessinPendu() {
		super();
	}

	/**
     * Dessin des partie du pendu selon l'etape
     *
     * @param       etape : c'est le numero de l'etape en question
     *    :           :         :
     * @see afficherEtapesPerdu
     * @author   Ousmane Diarra
     */
    public static void afficherEtapesPerdu(final int etape) {
        switch(etape) {
            case 0:
                System.out.println("\n");
                break;
            case 1:
                etape1();
                break;
            case 2:
                etape2();
                break;
            case 3:
                etape3();
                break;
            case 4:
                etape4();
                break;
            case 5:
                etape5();
                break;
            case 6:
                etape6();
                break;
            case 7:
                etape7();
                break;
            case 8:
                etape8();
                break;
            case 9:
                etape9();
                break;
            case 10:
                etape10();
                break;
            default:
                break;
        }
    }

    /**
     * etape1
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape1() {
    	System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("_____________\n");
    }

    /**
     * etape2
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape2() {
    	 System.out.println("\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println("_|____________\n");
    }

    /**
     * etape3
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape3() {
    	System.out.println("_____________\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println("_|____________\n");
    }

    /**
     * etape4
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape4() {
    	 System.out.println("_____________\n");
         System.out.println(" | /\n");
         System.out.println(" |/\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println("_|____________\n");
    }

    /**
     * etape5
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape5() {
    	System.out.println("_____________\n");
        System.out.println(" | /       |\n");
        System.out.println(" |/\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println("_|____________\n");
    }

    /**
     * etape6
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape6() {
    	System.out.println("_____________\n");
        System.out.println(" | /       |\n");
        System.out.println(" |/        O\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println("_|____________\n");
    }

    /**
     * etape1
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape7() {
    	 System.out.println("_____________\n");
         System.out.println(" | /       |\n");
         System.out.println(" |/        O\n");
         System.out.println(" |         |\n");
         System.out.println(" |\n");
         System.out.println(" |\n");
         System.out.println("_|____________\n");
    }

    /**
     * etape8
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape8() {
    	System.out.println("_____________\n");
        System.out.println(" | /       |\n");
        System.out.println(" |/        O\n");
        System.out.println(" |        -|-\n");
        System.out.println(" |\n");
        System.out.println(" |\n");
        System.out.println("_|____________\n");
    }

    /**
     * etape9
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape9() {
    	System.out.println("_____________\n");
        System.out.println(" | /       |\n");
        System.out.println(" |/        O\n");
        System.out.println(" |        -|-\n");
        System.out.println(" |         /\\\n");
        System.out.println(" |\n");
        System.out.println("_|____________\n");
    }

    /**
     * etape10
     *
     * @see DessinPendu
     * @author   Mael Veron
     */
    private static void etape10() {
    	System.out.println("_____________\n");
        System.out.println(" | /       |\n");
        System.out.println(" |/        O\n");
        System.out.println(" |        -|-\n");
        System.out.println(" |         /\\\n");
        System.out.println(" |\n");
        System.out.println("_|____________\n");
        System.out.println("La suicide squad ta eu !\n");
    }
}
