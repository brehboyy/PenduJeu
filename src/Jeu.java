import com.sun.xml.internal.ws.util.StringUtils;

public class Jeu {

	Menu menu = new Menu();	
	
	/** 
	 * Lance le jeu
	 *  
	 * @see LancerJeuy
	 * @author Mael Veron
	 */
	public void LancerJeu() 
	{	
		int dif = menu.accueil();
		
		String mot = "";
		DictionnaireDeMot dic = new DictionnaireDeMot();
		if(dif == 1) 
		{
			System.out.println("Vous êtes en mode débutant");
			mot = dic.getMotFacile();
		}
		else if (dif == 2)
		{
			System.out.println("Vous êtes en mode avancé");
			mot = dic.getMotDur();
		}
		
		VerificationLettre(mot);
	
	}
	
	/** 
	 * Vérifie les lettres dans le mot
	 *  
	 * @see VerificationLettre
	 * @author Mael Veron
	 * @param String mot le mot généré
	 */
	public void VerificationLettre(String mot) 
	{
		int essai = 0;
		boolean motBon = false;
		int nbLettreMot = mot.length();
		int nbLettreBonne = 0;
		System.out.println(nbLettreMot);
		while( motBon == false && essai < 10)
		{
			String lettre = menu.choixLettre();
			if(mot.contains(lettre)) {		
				System.out.println("Bonne lettre");
				nbLettreBonne += mot.chars().filter(ch -> ch == lettre.charAt(0)).count();
				if(nbLettreBonne >= nbLettreMot) {
					motBon = true;
				}
			}
			else
			{
				System.out.println("Mauvaise lettre");
			}
			
			essai++;
		}
		
		if(motBon == true) {
			System.out.println("Vous avez trouver le bon mot, félicitations !!");
		}else {
			System.out.println("Vous vous êtes trompé, dommage...");
		}
	}
}
