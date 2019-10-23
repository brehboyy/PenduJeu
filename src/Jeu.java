import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;

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
			System.out.println("Vous etes en mode debutant");
			mot = dic.getMotFacile();
		}
		else if (dif == 2)
		{
			System.out.println("Vous etes en mode avance");
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
	 * V�rifie les lettres dans le mot
	 *  
	 * @see VerificationLettre
	 * @author Mael Veron
	 * @param String mot le mot g�n�r�
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
			
			System.out.println(temp);
			if(temp == false) 
			{
				reussite = true;
			}
			
			System.out.println(lettreAtrouver);
			essai++;
			
		}
		
		return reussite;
	}
}
