package com.team2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * Cette classe va permettre de tester toute les methodes qui doivent etre
 * testé par junit
 *
 * @version 1.0
 *
 * @see Tests
 * @author Ousmane Diarra
 */
public class Tests {

    @Test
    public void testGetMotFacile() {
        final FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("test.txt");
        assertEquals("Le test doit retourner vrai pour le mot foch", ddm.getMotFacile(), "foch");
    }

    @Test
    public void testGetMotDur() {
        final FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("test.txt");
        assertEquals("\"Le test doit retourner vrai pour le mot publication", ddm.getMotDur(), "publication");
    }
}
