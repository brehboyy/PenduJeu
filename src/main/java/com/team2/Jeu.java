package com.team2;

import java.util.Arrays;

public class Jeu {

	Menu menu = new Menu();	
	
	/** 
	 * Lance le jeu
	 *  
	 * @see LancerJeu
	 * @author Mael Veron
	 */
	public void lancerJeu() 
	{	
		int dif = menu.accueil();
		
		String mot = "";
		DictionnaireDeMot dic = new DictionnaireDeMot("test.txt");
		if(dif == 1) 
		{
			System.out.println("Vous etes en mode debutant\n");
			mot = dic.getMotFacile();
		}
		else if (dif == 2)
		{
			System.out.println("Vous etes en mode avance\n");
			mot = dic.getMotDur();
		}
		
		
		if(verificationLettre(mot) == true) {
			System.out.println("Vous avez trouver le bon mot, felicitations !!");
		}else {
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
	public boolean verificationLettre(String mot) 
	{
		char[] motLettre = mot.toCharArray();
		char[] lettreAtrouver = new char[motLettre.length];
		
		for(int i = 0; i < motLettre.length; i++) {
			lettreAtrouver[i] = '_';
		}
	
		int essai = 0;
		boolean reussite = false;
		boolean temp = false;
		affichage(lettreAtrouver);
		
		while(reussite == false && essai < 10)
		{
			char lettre = menu.choixLettre().charAt(0);
			for(int i = 0; i < motLettre.length; i++)
			{
				temp = false;
				if(motLettre[i] == lettre) 
				{
					lettreAtrouver[i] = lettre;						
				}
				
				else if(lettreAtrouver[i] == '_') 
				{
					temp = true;
				}
			}
			if(temp == false) 
			{
				reussite = true;
			}
			
			affichage(lettreAtrouver);
			essai++;			
		}		
		return reussite;
	}
	
	/** 
	 * Affiche les lettres
	 *  
	 * @see affichage
	 * @author Mael Veron
	 * @param char[] lettreAtrouver
	 */
	public void affichage(char[] lettreAtrouver) {
		String affichage ="";
		for(int i = 0; i < lettreAtrouver.length; i++) 
		{
			affichage += lettreAtrouver[i] + " ";
		}
		System.out.println(affichage);
	}
}
