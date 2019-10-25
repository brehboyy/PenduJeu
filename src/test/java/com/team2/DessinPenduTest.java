package com.team2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Cette classe va permettre d'afficher au fur et a mesure les differentes
 * etapes du pendu
 *
 * @version 1.0
 *
 * @see DessinPendu
 * @author Ousmane Diarra
 */
public final class DessinPenduTest {

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
    public void testafficherEtapes1PerduTrue()
    {
        DessinPendu.afficherEtapesPerdu(0);
        assertEquals("Affiche le resultat de l'etape 0",
                "\n\n", outContent.toString());
    }
}
