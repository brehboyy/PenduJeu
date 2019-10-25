package com.team2;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

public class PenduTordu extends ADictionnaireDeMot {

    @Override
    public boolean verificationLettre(final String mot) {
        // TODO Auto-generated method stub
        final char[] motLettre = mot.toCharArray();
        final List<Character> lettreAtrouver = new ArrayList<Character>();
        for (int i = 0; i < motLettre.length; i++) {
            lettreAtrouver.add('_');
        }
        int essai = 0;
        boolean reussite = false;
        affichage(lettreAtrouver);
        final Collator instance = Collator.getInstance();
        while (!reussite && essai < 20) {
            final char lettre = menu.choixLettre().charAt(0);
            if (estDansMot(lettre, motLettre)) {
                boolean trouve = false;
                int i = 0;
                while (!trouve)
                {
                    instance.setStrength(Collator.NO_DECOMPOSITION);
                    if (
                            instance.compare(String.valueOf(motLettre[i]),
                                    String.valueOf(lettre)) == 0 &&
                            instance.compare(String.valueOf(motLettre[i]),
                                    String.valueOf(lettreAtrouver.get(i))) != 0) {
                        lettreAtrouver.set(i, lettre);
                        trouve = true;
                    }
                    i++;
                }
                DessinPendu.afficherEtapesPerdu(essai);
            } else {
                essai++;
                DessinPendu.afficherEtapesPerdu(essai);
            }
            reussite = estComplet(lettreAtrouver);
            affichage(lettreAtrouver);
            System.out.println("Il vous reste " + (20 - essai) + " essai(s)\n");
        }
        return reussite;
    }


}
