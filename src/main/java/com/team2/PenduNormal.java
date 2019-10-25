package com.team2;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class PenduNormal extends ADictionnaireDeMot {

    @Override
    public boolean verificationLettre(final String mot) {
        final char[] motLettre = mot.toCharArray();
        final List<Character> lettreAtrouver = new ArrayList<Character>();
        for (int i = 0; i < motLettre.length; i++) {
            lettreAtrouver.add('_');
        }
        int essai = 0;
        boolean reussite = false;
        affichage(lettreAtrouver);
        final Collator instance = Collator.getInstance();
        while (!reussite && essai < 10) {
            final char lettre = menu.choixLettre().charAt(0);
            if (estDansMot(lettre, motLettre)) {
                for (int i = 0; i < motLettre.length; i++) {
                    instance.setStrength(Collator.NO_DECOMPOSITION);
                    if (instance.compare(String.valueOf(motLettre[i]), String.valueOf(lettre)) == 0) {
                        lettreAtrouver.set(i, lettre);
                    }
                }
                DessinPendu.afficherEtapesPerdu(essai);
            }
            else
            {
                essai++;
                DessinPendu.afficherEtapesPerdu(essai);
            }
            reussite = estComplet(lettreAtrouver);
            affichage(lettreAtrouver);
            System.out.println("Il vous reste " + (10 - essai) +" essai(s)\n");
        }
        return reussite;
    }
}


