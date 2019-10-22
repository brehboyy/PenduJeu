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
		DictionnaireDeMot dic = new DictionnaireDeMot("test.txt");
		if(dif == 1) 
		{
			System.out.println("Vous �tes en mode d�butant");
			mot = dic.getMotFacile();
		}
		else if (dif == 2)
		{
			System.out.println("Vous �tes en mode avanc�");
			mot = dic.getMotDur();
		}
		
		
		if(VerificationLettre(mot) == true) {
			System.out.println("Vous avez trouver le bon mot, f�licitations !!");
		}else {
			System.out.println("Vous vous �tes tromp�, dommage...");
		}
	}
	
	/** 
	 * V�rifie les lettres dans le mot
	 *  
	 * @see VerificationLettre
	 * @author Mael Veron
	 * @param String mot le mot g�n�r�
	 * @return reussite
	 */
	public boolean VerificationLettre(String mot) 
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
