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
	 * Dessin des partie du pendu selon l'etape
	 *  
	 * @param       etape : c'est le numéro de l'etape en question
	 *    :           :         : 
	 * @see afficherEtapesPerdu
	 * @author   Ousmane Diarra
	 */
	public static void afficherEtapesPerdu(int etape) {
		switch(etape) {
		case 0:
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			break;
		case 1:
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("_____________\n");
			break;
		case 2:
			System.out.println("\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 3:
			System.out.println("_____________\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 4:
			System.out.println("_____________\n");
			System.out.println(" | /\n");
			System.out.println(" |/\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 5:
			System.out.println("_____________\n");
			System.out.println(" | /       |\n");
			System.out.println(" |/\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 6:
			System.out.println("_____________\n");
			System.out.println(" | /       |\n");
			System.out.println(" |/        O\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 7:
			System.out.println("_____________\n");
			System.out.println(" | /       |\n");
			System.out.println(" |/        O\n");
			System.out.println(" |         |\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 8:
			System.out.println("_____________\n");
			System.out.println(" | /       |\n");
			System.out.println(" |/        O\n");
			System.out.println(" |        -|-\n");
			System.out.println(" |\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 9:
			System.out.println("_____________\n");
			System.out.println(" | /       |\n");
			System.out.println(" |/        O\n");
			System.out.println(" |        -|-\n");
			System.out.println(" |         /\\\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			break;
		case 10:
			System.out.println("_____________\n");
			System.out.println(" | /       |\n");
			System.out.println(" |/        O\n");
			System.out.println(" |        -|-\n");
			System.out.println(" |         /\\\n");
			System.out.println(" |\n");
			System.out.println("_|____________\n");
			System.out.println("La suicide squad ta eu !\n");
			break;
		}
	}

}
