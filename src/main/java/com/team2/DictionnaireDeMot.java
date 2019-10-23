package com.team2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Classe contenant le dictionnaire de mot du pendu
 * 
 * 
 * @version 1.0
 *
 * @see DictionnaireDeMot
 * @author Ousmane Diarra
 */
public class DictionnaireDeMot {

	public ArrayList<String> listMots;

	/**
	 * Chargement des mots a partir d'un fichier cotenant une multitude de mots vers
	 * un tableau de chaine de charactere
	 * 
	 * @see chargerMot
	 * @author Ousmane Diarra
	 */
	public DictionnaireDeMot(String nomFichier) {
		try {
			InputStream flux = new FileInputStream(nomFichier);
			InputStreamReader lecture = new InputStreamReader(flux, "UTF-8");
			BufferedReader buff = new BufferedReader(lecture);
			String ligne;
			this.listMots = new ArrayList<String>();
			while ((ligne = buff.readLine()) != null) {
				listMots.add(ligne);
			}
			buff.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * Conversion des caractères d'une chaine en minuscules sans accents
	 * 
	 * @param       mot : c'est le mot dont on doit ignorer les accents
	 * 
	 * @return 		charData : La chaine de caractere sans les accent ni majuscule
	 * 
	 * @see versMinuscule
	 * @author Ousmane Diarra
	 */
	 public String versMinuscule(String mot) {
		char[] charsData = new char[mot.length()];
		mot.getChars(0, charsData.length, charsData, 0);

		char c;
		for (int i = 0; i < charsData.length; i++)
			if ((c = charsData[i]) >= 'A' && c <= 'Z')
				charsData[i] = (char) (c - 'A' + 'a');
			else
				switch (c) {
				case '\u00e0':
				case '\u00e2':
				case '\u00e4':
					charsData[i] = 'a';
					break;
				case '\u00e7':
					charsData[i] = 'c';
					break;
				case '\u00e8':
				case '\u00e9':
				case '\u00ea':
				case '\u00eb':
					charsData[i] = 'e';
					break;
				case '\u00ee':
				case '\u00ef':
					charsData[i] = 'i';
					break;
				case '\u00f4':
				case '\u00f6':
					charsData[i] = 'o';
					break;
				case '\u00f9':
				case '\u00fb':
				case '\u00fc':
					charsData[i] = 'u';
					break;
				}

		return new String(charsData);
	}
	
	
	/**
	 * Recuperation d'un mot alearoirement parmis les mots dur donc les mot qui font minimum 5 caractere
	 * 
	 * @return 		Le mot que l'utilisateur du pendu devra trouver
	 * 
	 * @see getMotDur
	 * @author Ousmane Diarra
	 */
	public String getMotDur() {
		
		List<String> listMotsDur = this.listMots
				  .stream()
				  .filter(c -> c.length() > 4)
				  .collect(Collectors.toList());
		
		int indexAlea = new Random().nextInt(listMotsDur.size());
		return listMotsDur.get(indexAlea);
	}
	
	/**
	 * Recuperation d'un mot alearoirement parmis les mots dur donc les mot qui font minimum 5 caractere
	 * 
	 * @return 		Le mot que l'utilisateur du pendu devra trouver
	 * 
	 * @see getMotDur
	 * @author Ousmane Diarra
	 */
	public String getMotFacile() {
		
		List<String> listMotsFacile = this.listMots
				  .stream()
				  .filter(c -> c.length() == 4 || c.length() == 3)
				  .collect(Collectors.toList());
		
		int indexAlea = new Random().nextInt(listMotsFacile.size());
		return listMotsFacile.get(indexAlea);
	}
}
