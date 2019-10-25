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
        ListeDictionnaireDeMot dictMot = new ListeDictionnaireDeMot();
        dictMot.remplirListe("");

        String[] listMotsSimpleTemp = new String[] { "vers", "loto", "roti", "zero", "ete", "jour", "nuit", "zoro",
                "miel" };
        assertEquals("Test de l'egality des liste de mot", listMotsSimpleTemp, dictMot.listMotsSimple);
    }

    @Test
    public void testRemplirListeDur() {
        ListeDictionnaireDeMot dictMot = new ListeDictionnaireDeMot();
        dictMot.remplirListe("");

        String[] listMotsDurTemp = new String[] { "printemps", "janvier", "supprimer", "cheval", "route", "tournesol",
                "ourson", "haribo", "luminaire" };
        assertEquals("Test de l'egality des liste de mot", listMotsDurTemp, dictMot.listMotsDur);
    }

    @Test
    public void testRemplirListeSimpleFalse() {
        ListeDictionnaireDeMot dictMot = new ListeDictionnaireDeMot();
        dictMot.remplirListe("");

        String[] listMotsDurTemp = new String[] { "printemps", "janvier", "supprimer", "cheval", "route", "tournesol",
                "ourson", "haribo", "luminaire" };
        assertNotEquals("Test de l'egality des liste de mot", listMotsDurTemp, dictMot.listMotsSimple);
    }

    @Test
    public void testGetMotFacileFaux() {
        final ListeDictionnaireDeMot ddm = new ListeDictionnaireDeMot();
        ddm.remplirListe("");
        assertFalse("Le test doit retourner vrai pour le mot foch", ddm.getMotFacile() == "");
    }

    @Test
    public void testGetMotDurFaux() {
        final ListeDictionnaireDeMot ddm = new ListeDictionnaireDeMot();
        ddm.remplirListe("");
        assertFalse("\"Le test doit retourner vrai pour le mot publication", ddm.getMotDur() == "");
    }

    @Test
    public void testGetMotFacile() {
        final ListeDictionnaireDeMot ddm = new ListeDictionnaireDeMot();
        ddm.remplirListe("");
        assertTrue("Le test doit retourner vrai pour le mot foch", ddm.getMotFacile().length() > 0);
    }

    @Test
    public void testGetMotDur() {
        final ListeDictionnaireDeMot ddm = new ListeDictionnaireDeMot();
        ddm.remplirListe("");
        assertTrue("Le test doit retourner vrai pour le mot foch", ddm.getMotFacile().length() > 0);
    }

    @Test
    public void testGetMotDurTrue() {
        ListeDictionnaireDeMot dictMot = new ListeDictionnaireDeMot();
        dictMot.remplirListe("");

        String motdur = dictMot.getMotDur();
        boolean result = false;
        if (Arrays.asList(dictMot.listMotsDur).contains(motdur)) {
            result = true;
        }
        assertTrue("Le test doit retourner vrai", result);
    }

    @Test
    public void testGetMotFacileFalse() {
        ListeDictionnaireDeMot dictMot = new ListeDictionnaireDeMot();
        dictMot.remplirListe("");
        String motfacile = dictMot.getMotFacile();
        assertFalse("Le test doit retourner faux", Arrays.asList(dictMot.listMotsDur).contains(motfacile));
    }

    @Test
    public void testGetMotDurFalse() {
        ListeDictionnaireDeMot dictMot = new ListeDictionnaireDeMot();
        dictMot.remplirListe("");
        assertFalse("Le test doit retourner faux", Arrays.asList(dictMot.listMotsSimple).contains("kljlkkdsl"));
    }

}
