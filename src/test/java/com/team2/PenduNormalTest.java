package com.team2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PenduNormalTest{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void testequalTabTrue() {
        final PenduNormal pn = new PenduNormal();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('c');
        assertTrue("Le test doit retourner vrai car le mot est complet", pn.estComplet(lstTest));
    }

    @Test
    public void testequalTabFalse() {
        final PenduNormal pn = new PenduNormal();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('_');
        assertFalse("Le test doit retourner faux car le mot est imcomplet", pn.estComplet(lstTest));
    }

    @Test
    public void testestDansMotTrue() {
        final PenduNormal pn = new PenduNormal();
        final char[] motLettre = "abc".toCharArray();
        assertTrue("Le test doit retourner vrai car la liste contient c", pn.estDansMot('c', motLettre));
    }

    @Test
    public void testestDansMotFalse() {
        final PenduNormal pn = new PenduNormal();
        final char[] motLettre = "abc".toCharArray();
        assertFalse("Le test doit retourner faux car la liste ne contient pas c", pn.estDansMot('z',motLettre));
    }
    @Test
    public void testaffichageTrue() {
        final PenduNormal pn = new PenduNormal();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('c');
        pn.affichage(lstTest);
        assertEquals("la fonction affichage renvoi a b c on doit donc avoir le me resultat", "a b c \n", outContent.toString());
    }

    @Test
    public void testaffichageFalse() {
        final PenduNormal pn = new PenduNormal();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('c');
        pn.affichage(lstTest);
        assertNotEquals("la fonction affichage renvoi a b c on doit donc avoir le me resultat", "z y x \n", outContent.toString());
    }
}


