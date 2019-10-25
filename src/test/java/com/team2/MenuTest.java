package com.team2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Ignore;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Cette classe va permettre a l'utilisateur de faire des entrer clavier.
 *
 * @version 1.0
 *
 * @see DessinPendu
 * @author Ousmane Diarra
 */
public class MenuTest {

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
    public void testaccueilTrue() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et renvoyé 1 ", 1, menu.selectDifficulte());
    }

    @Test
    public void testaccueilFalse() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre vrai et renvoyé 2 ", 1, menu.selectDifficulte());
    }

    @Test
    public void testmodeSoloTrue() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et renvoyé 1 ",
                 DictionnaireDeMotFactory.TypeMode.Solo, menu.selectMode());
    }

    @Test
    public void testmodeSoloFalse() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre vrai et renvoyé 2 ",
                DictionnaireDeMotFactory.TypeMode.Solo, menu.selectMode());
    }

    @Test
    public void testmodeMultiTrue() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et renvoyé 1 ",
                 DictionnaireDeMotFactory.TypeMode.Multi, menu.selectMode());
    }

    @Test
    public void testmodeMultiFalse() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre vrai et renvoyé 2 ",
                DictionnaireDeMotFactory.TypeMode.Multi, menu.selectMode());
    }

    @Test
    public void testaccueilChoixLettreTrue() {
        final String value = "a\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et renvoyé a ", "a", menu.choixLettre());
    }

    @Test
    public void testaccueilChoixLettreFalse() {
        final String value = "b\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre vrai et renvoyé b ", "a", menu.choixLettre());
    }
    @Test
    public void testdemandeJeuNormalTrue() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et renvoyé type Normal ",
                DictionnaireDeMotFactory.TypeJeu.Normal, menu.demandeJeu());
    }

    @Test
    public void testdemandeJeuTorduTrue() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et type tordu ",
                DictionnaireDeMotFactory.TypeJeu.Tordu, menu.demandeJeu());
    }

    @Test
    public void testdemandeJeuNormalFalse() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre faux et renvoyé type tordu ",
                DictionnaireDeMotFactory.TypeJeu.Normal, menu.demandeJeu());
    }

    @Test
    public void testdemandeJeuTorduFalse() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre faux et renvoyé type normal ",
                DictionnaireDeMotFactory.TypeJeu.Tordu, menu.demandeJeu());
    }



    @Test
    public void testdemandeDictListTrue() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et renvoyé type Normal ",
                DictionnaireDeMotFactory.TypeListe.Liste, menu.demandeEndroitDictionnaire());
    }

    @Test
    public void testdemandeDictFichierTrue() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("Le test doit etre vrai et type tordu ",
                DictionnaireDeMotFactory.TypeListe.Fichier, menu.demandeEndroitDictionnaire());
    }

    @Test
    public void testdemandeDictListeFalse() {
        final String value = "2\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre faux et renvoyé type tordu ",
                DictionnaireDeMotFactory.TypeListe.Liste, menu.demandeEndroitDictionnaire());
    }

    @Test
    public void testdemandeDictFichierFalse() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre faux et renvoyé type normal ",
                DictionnaireDeMotFactory.TypeListe.Fichier, menu.demandeEndroitDictionnaire());
    }

    @Test
    @Ignore
    public void testdemandeNomFichierTrue() {
        final String value = "test.txt\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertNotEquals("Le test doit etre faux et renvoyé type normal ",
                "test.txt", menu.demandeNomFichier());
    }
}
