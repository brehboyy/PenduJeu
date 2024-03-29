package com.team2;

import java.util.Random;

@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class ListeDictionnaireDeMot implements IDictionnaireDeMot {

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
    public void remplirListe(final String fichier) {
        // TODO Auto-generated method stub
        this.listMotsSimple = new String[] { "vers", "loto", "roti", "zero", "ete", "jour", "nuit", "zoro", "miel" };
        this.listMotsDur = new String[] { "printemps", "janvier", "supprimer", "cheval", "route", "tournesol", "ourson",
                "haribo", "luminaire" };
    }
}
