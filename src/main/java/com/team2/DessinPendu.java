package com.team2;

/**
 *
 * Cette classe va permettre d'afficher au fur et a mesure les differentes
 * etapes du pendu
 *
 * @version 1.0
 *
 * @see DessinPendu
 * @author Ousmane Diarra
 */
@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public final class DessinPendu {

    /**
     * Constructeur de la classe.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    private DessinPendu() {
        super();
    }

    /**
     * Dessin des partie du pendu selon l'etape.
     *
     * @author Ousmane Diarra
     * @param etape : c'est le numero de l'etape en question
     * @see afficherEtapesPerdu
     */
    public static void afficherEtapesPerdu(final int etape) {
        switch (etape % 11) {
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
                etape9();
                break;
            default:
                break;
        }
    }

    /**
     * ceci est l'etape1.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape1() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        base();
    }

    /**
     * ceci est l'etape2.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape2() {
        System.out.println("\n");
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape3.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape3() {
        barreDuHaut();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape4.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape4() {
        barreDuHaut();
        System.out.println(" | /\n");
        transversale();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape5.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape5() {
        barreDuHaut();
        barreHautTete();
        transversale();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape6.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape6() {
        barreDuHaut();
        barreHautTete();
        ligneTete();
        barreHorizontale();
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape7.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape7() {
        barreDuHaut();
        barreHautTete();
        ligneTete();
        System.out.println(" |         |\n");
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape8.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape8() {
        barreDuHaut();
        barreHautTete();
        ligneTete();
        System.out.println(" |        -|-\n");
        barreHorizontale();
        barreHorizontale();
        base();
    }

    /**
     * ceci est l'etape9.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void etape9() {
        barreDuHaut();
        barreHautTete();
        ligneTete();
        System.out.println(" |        -|-\n");
        System.out.println(" |         /\\\n");
        barreHorizontale();
        base();
    }

    /**
     * ceci est la base.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void base() {
        System.out.println("_|____________\n");
    }

    /**
     * ceci est la barreHorizontale.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void barreHorizontale() {
        System.out.println(" |\n");
    }

    /**
     * ceci est la barreDuHaut.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void barreDuHaut() {
        System.out.println("_____________\n");
    }

    /**
     * ceci est la ligneTete.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void ligneTete() {
        System.out.println(" |/        O\n");
    }

    /**
     * ceci est la barreHautTete.
     *
     * @author Mael Veron
     * @see DessinPendu
     */
    public static void barreHautTete() {
        System.out.println(" | /       |\n");
    }

    /**
     * ceci est la barre transversale.
     *
     * @author Mael Veron
     * @see transversale
     */
    public static void transversale() {
        System.out.println(" |/\n");
    }
}
