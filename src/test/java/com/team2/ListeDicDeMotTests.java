package com.team2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

public class ListeDicDeMotTests {

    @Test
    public void testRemplirListeSimple() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");

        String[] listMotsSimpleTemp = new String[] { "vers", "loto", "roti", "zero", "ete", "jour", "nuit", "zoro",
                "miel" };
        assertEquals("Test de l'egality des liste de mot", listMotsSimpleTemp, l.listMotsSimple);
    }

    @Test
    public void testRemplirListeDur() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");

        String[] listMotsDurTemp = new String[] { "printemps", "janvier", "supprimer", "cheval", "route", "tournesol",
                "nuit", "ourson", "haribo", "luminaire" };
        assertEquals("Test de l'egality des liste de mot", listMotsDurTemp, l.listMotsDur);
    }

    @Test
    public void testRemplirListeSimpleFalse() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");

        String[] listMotsDurTemp = new String[] { "printemps", "janvier", "supprimer", "cheval", "route", "tournesol",
                "nuit", "ourson", "haribo", "luminaire" };
        assertNotEquals("Test de l'egality des liste de mot", listMotsDurTemp, l.listMotsSimple);
    }

    @Test
    public void testRemplirListeDurFalse() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");
        String[] listMotsSimpleTemp = new String[] { "vers", "loto", "roti", "zero", "ete", "jour", "nuit", "zoro",
        "miel" };

        assertNotEquals("Test de l'egality des liste de mot", listMotsSimpleTemp, l.listMotsDur);
    }

    @Test
    public void testGetMotFacileTrue() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");
        String motfacile = l.getMotFacile();
        boolean result = false;
        if (Arrays.asList(l.listMotsSimple).contains(motfacile)) {
            result = true;
        }
        assertTrue("Le test doit retourner vrai", result);
    }

    @Test
    public void testGetMotDurTrue() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");

        String motdur = l.getMotDur();
        boolean result = false;
        if (Arrays.asList(l.listMotsDur).contains(motdur)) {
            result = true;
        }
        assertTrue("Le test doit retourner vrai", result);
    }

    @Test
    public void testGetMotFacileFalse() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");
        String motfacile = l.getMotFacile();
        boolean result = false;
        if (Arrays.asList(l.listMotsDur).contains(motfacile)) {
            result = true;
        }
        assertFalse("Le test doit retourner faux", result);
    }

    @Test
    public void testGetMotDurFalse() {
        ListeDictionnaireDeMot l = new ListeDictionnaireDeMot();
        l.RemplirListe("");

        String motdur = l.getMotDur();
        boolean result = false;
        if (Arrays.asList(l.listMotsSimple).contains(motdur)) {
            result = true;
        }
        assertFalse("Le test doit retourner faux", result);
    }


    private static boolean checkEquality(String[] s1, String[] s2) {
        if (s1 == s2)
            return true;

        if (s1 == null || s2 == null)
            return false;

        int n = s1.length;
        if (n != s2.length)
            return false;

        for (int i = 0; i < n; i++) {
            if (!s1[i].equals(s2[i]))
                return false;
        }

        return true;
    }

}
