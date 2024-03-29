package com.team2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PenduTorduTest {

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
        final PenduTordu pt = new PenduTordu();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('c');
        assertTrue("Le test doit retourner vrai car le mot est complet", pt.estComplet(lstTest));
    }

    @Test
    public void testequalTabFalse() {
        final PenduTordu pt = new PenduTordu();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('_');
        assertFalse("Le test doit retourner faux car le mot est imcomplet", pt.estComplet(lstTest));
    }

    @Test
    public void testestDansMotTrue() {
        final PenduTordu pt = new PenduTordu();
        final char[] motLettre = "abc".toCharArray();
        assertTrue("Le test doit retourner vrai car la liste contient c", pt.estDansMot('c', motLettre));
    }

    @Test
    public void testestDansMotFalse() {
        final PenduTordu pt = new PenduTordu();
        final char[] motLettre = "abc".toCharArray();
        assertFalse("Le test doit retourner faux car la liste ne contient pas c", pt.estDansMot('z', motLettre));
    }

    @Test
    public void testaffichageTrue() {
        final PenduTordu pt = new PenduTordu();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('c');
        pt.affichage(lstTest);
        assertEquals("la fonction affichage renvoi a b c on doit donc avoir le me resultat", "a b c \n",
                outContent.toString());
    }

    @Test
    public void testaffichageFalse() {
        final PenduTordu pt = new PenduTordu();
        final List<Character> lstTest = new ArrayList<Character>();
        lstTest.add('a');
        lstTest.add('b');
        lstTest.add('c');
        pt.affichage(lstTest);
        assertNotEquals("la fonction affichage renvoi a b c on doit donc avoir le me resultat", "z y x \n",
                outContent.toString());
    }

    @Test
    public void testVerificationLettreTrue() {
        final String value = "a\nb\nc\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final PenduTordu pt = new PenduTordu();
        assertTrue("La fonction devrais renvoye true car on va entrer succesivement toute les lettre du mot",
                pt.verificationLettre("abc"));
    }

    @Test
    public void testVerificationLettreFalse() {
        final String value = "t\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\nt\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final PenduTordu pt = new PenduTordu();
        assertFalse("On test le cas ou l'utilisateur perd le jeu du pendu normal", pt.verificationLettre("abc"));
    }
}
