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
		int essai = 0;
		boolean reussite = false;
		int nbLettreMot = mot.length();
		int nbLettreBonne = 0;
		System.out.println(nbLettreMot);
		while( reussite == false && essai < 10)
		{
			String lettre = menu.choixLettre();
			if(mot.contains(lettre)) {		
				System.out.println("Bonne lettre");
				nbLettreBonne += mot.chars().filter(ch -> ch == lettre.charAt(0)).count();
				if(nbLettreBonne >= nbLettreMot) {
					reussite = true;
				}
			}
			else
			{
				System.out.println("Mauvaise lettre");
			}
			
			essai++;
		}
		return reussite;
		
	}
}
