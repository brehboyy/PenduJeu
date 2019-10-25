package com.team2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import static org.junit.Assert.assertFalse;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * Cette classe va permettre de tester toute les methodes qui doivent etre
 * testé par junit
 *
 * @version 1.0
 *
 * @see FichierDicDeMotTests
 * @author Ousmane Diarra
 */
public class FichierDicDeMotTests {

     @Rule
        public ExpectedException expectedEx = ExpectedException.none();

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
        assertEquals("Le test doit retourner vrai pour le mot publication", ddm.getMotDur(), "publication");
    }

    @Test
    public void testGetMotFacileFaux() {
        final FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("test.txt");
        assertFalse("Le test doit retourner vrai pour le mot foch", ddm.getMotFacile() == "");
    }

    @Test
    public void testGetMotDurFaux() {
        final FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("test.txt");
        assertFalse("Le test doit retourner vrai pour le mot publication", ddm.getMotDur() == "");
    }



    @Test(expected = AssertionError.class)
    @Ignore
    public void testGetMotFacileException() {
        try
           {
            final FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
            ddm.RemplirListe("e");
           }
           catch(AssertionError re)
           {
              String message = "Employee ID is null";
              assertEquals(message, re.getMessage());
              throw re;
            }
            fail("Employee Id Null exception did not throw!");

    }



    @Test
    @Ignore
    public void testGetMotDurException() {
        expectedEx.expect(AssertionError.class);
        expectedEx.expectMessage("Lalalla");
        final FichierDictionnaireDeMot ddm = new FichierDictionnaireDeMot();
        ddm.RemplirListe("vb");
    }
}
