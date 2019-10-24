package com.team2;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Cette classe va permettre a l'utilisateur de faire des entrer clavier
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
    public void testaccueil() {
        final String value = "1\n";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(value.getBytes());
        System.setIn(inContent);
        final Menu menu = new Menu();
        assertEquals("", 1, menu.accueil());
    }
}
