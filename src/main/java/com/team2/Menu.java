package com.team2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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
		System.out.println("Bonjour et bienvenue sur le jeu du pendu de la Suicide Squad");
		System.out.println("Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
		boolean estUnNombre = false;
		int number = 0;
		while (!estUnNombre) {
			try {
				number = (new Scanner(System.in)).nextInt();
				if(number == 1 || number == 2) {
					estUnNombre = true;
				}else {
					System.out.println("Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
					estUnNombre = false;
				}
			}catch(InputMismatchException ex) {
				System.out.println("Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
				estUnNombre = false;
			}catch (NoSuchElementException ex){
				System.out.println("Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
				estUnNombre = false;
			}
		}
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
		while(lettre.length() != 1 || !Character.isLetter(lettre.charAt(0))) {
			System.out.println("Valeur invalide, entrez une seule lettre !");
			lettre = console.nextLine();
		}
		return lettre;
	}
	
	
}
