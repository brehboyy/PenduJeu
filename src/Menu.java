import java.util.Scanner;

public class Menu {
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** 
	 * Accueil du programme
	 *  
	 * @see accueil
	 * @author Mael Veron
	 * @return int le niveau de difficulte
	 */
	public int accueil() 
	{		
		Scanner console = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue sur le jeu du pendu de la Suicide Squad");
		System.out.println("Veuillez sélectionner un niveau de difficulté entre 1 (débutant) et 2 (avancé) :");
        int number = console.nextInt();
  
        return number;
	}
	
	/** 
	 * Affiche la phrase de choix d'une lettre
	 *  
	 * @see choixLettre
	 * @author Mael Veron
	 * @return String la lettre choisit
	 */
	public String choixLettre() {
		
		System.out.println("Veuillez choisir une lettre");
		Scanner console = new Scanner(System.in);
		String lettre = console.nextLine();
		
		return lettre;
	}
	
	
}
