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
	 * ceci est l'etape1
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
		base();
	}

	/**
	 * ceci est l'etape2
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape2() {
		System.out.println("\n");
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape3
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape3() {
		barreDuHaut();
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape4
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape4() {
		barreDuHaut();
		System.out.println(" | /\n");
		System.out.println(" |/\n");
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape5
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape5() {
		barreDuHaut();
		barreHautTete();
		System.out.println(" |/\n");
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape6
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape6() {
		barreDuHaut();
		barreHautTete();
		ligneTete();
		barreHorizontale();
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape7
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape7() {
		barreDuHaut();
		barreHautTete();
		ligneTete();
		System.out.println(" |         |\n");
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape8
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape8() {
		barreDuHaut();
		barreHautTete();
		ligneTete();
		System.out.println(" |        -|-\n");
		barreHorizontale();
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape9
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape9() {
		barreDuHaut();
		barreHautTete();
		ligneTete();
		System.out.println(" |        -|-\n");
		System.out.println(" |         /\\\n");
		barreHorizontale();
		base();
	}

	/**
	 * ceci est l'etape10
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void etape10() {
		barreDuHaut();
		barreHautTete();
		ligneTete();
		System.out.println(" |        -|-\n");
		System.out.println(" |         /\\\n");
		barreHorizontale();
		base();
		System.out.println("La suicide squad ta eu !\n");
	}

	/**
	 * ceci est la base
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void base() {
		System.out.println("_|____________\n");
	}

	/**
	 * ceci est la barreHorizontale
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void barreHorizontale() {
		System.out.println(" |\n");
	}

	/**
	 * ceci est la barreDuHaut
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void barreDuHaut() {
		System.out.println("_____________\n");
	}

	/**
	 * ceci est la ligneTete
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void ligneTete() {
		System.out.println(" |/        O\n");
	}

	/**
	 * ceci est la barreHautTete
	 *
	 * @see DessinPendu
	 * @author   Mael Veron
	 */
	private static void barreHautTete() {
		System.out.println(" | /       |\n");
	}
}
