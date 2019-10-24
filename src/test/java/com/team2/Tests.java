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
        FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("test.txt");
        assertEquals(ddm.getMotFacile(), "foch");
    }

    @Test
    public void testGetMotDur() {
        FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("test.txt");
        assertEquals(ddm.getMotDur(), "publication");
    }

    @Test
    public void testequalTabTrue() {
        Jeu jeu = new Jeu();
        assertEquals(jeu.estComplet(new char[] { 'a', 'b', 'c' }), true);
    }

    @Test
    public void testequalTabFalse() {
        Jeu jeu = new Jeu();
        assertEquals(jeu.estComplet(new char[] { 'a', 'b', '_' }), false);
    }

    @Test
    public void testestDansMotTrue() {
        Jeu jeu = new Jeu();
        assertEquals(jeu.estDansMot('c', new char[] { 'a', 'b', 'c' }), true);
    }

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

    @Test
    public void testequalTabTrue() {
        final Jeu jeu = new Jeu();
        assertTrue("Le test doit retourner vrai car le mot est complet", jeu.estComplet(new char[] {'a', 'b',  'c'}));
    }

    @Test
    public void testequalTabFalse() {
        final Jeu jeu = new Jeu();
        assertFalse("Le test doit retourner faux car le mot est imcomplet", jeu.estComplet(new char[] {'a', 'b',  '_'}));
    }

    @Test
    public void testestDansMotTrue() {
        final Jeu jeu = new Jeu();
        assertTrue("Le test doit retourner vrai car la liste contient c", jeu.estDansMot('c',new char[] {'a', 'b',  'c'}));
    }

    @Test
    public void testestDansMotFalse() {
        final Jeu jeu = new Jeu();
        assertFalse("Le test doit retourner faux car la liste ne contient pas c", jeu.estDansMot('z',new char[] {'a', 'b',  'c'}));
    }
}
