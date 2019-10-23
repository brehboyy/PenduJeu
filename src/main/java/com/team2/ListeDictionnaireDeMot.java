package com.team2;

import java.util.Random;

public class ListeDictionnaireDeMot implements DictionnaireDeMot {

    public String[] listMotsSimple;
    public String[] listMotsDur;

    @Override
    public String getMotDur() {
        final int indexAlea = new Random().nextInt(listMotsDur.length);
        return listMotsDur[indexAlea];
    }

    @Override
    public String getMotFacile() {
        final int indexAlea = new Random().nextInt(listMotsSimple.length);
        return listMotsSimple[indexAlea];
    }

    @Override
    public void RemplirListe(final String fichier) {
        // TODO Auto-generated method stub
        this.listMotsSimple = new String[] {
                "vers","loto","roti","zero","été","jour","nuit", "zoro", "miel"
        };
        this.listMotsDur = new String[] {
                "printemps","janvier","supprimer","cheval","route","tournesol","nuit", "ourson", "haribo", "luminaire"
        };
    }
}
