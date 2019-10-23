package com.team2;

import java.util.ArrayList;
import java.util.Random;

public class ListeDictionnaireDeMot implements DictionnaireDeMot {

	public String[] listMotsSimple;
	public String[] listMotsDur;

	@Override
	public String getMotDur() {
		int indexAlea = new Random().nextInt(listMotsDur.length);
		return listMotsDur[indexAlea];
	}

	@Override
	public String getMotFacile() {
		int indexAlea = new Random().nextInt(listMotsSimple.length);
		return listMotsSimple[indexAlea];
	}

	@Override
	public void RemplirListe(String fichier) {
		// TODO Auto-generated method stub
		this.listMotsSimple = new String[] {
				"vers","loto","roti","zero","ete","jour","nuit", "zoro", "miel"
		};
		this.listMotsDur = new String[] {
				"printemps","janvier","supprimer","cheval","route","tournesol","nuit", "ourson", "haribo", "luminaire"
		};
	}
}
