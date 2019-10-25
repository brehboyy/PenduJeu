package com.team2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public final class DictionnaireDeMotFactoryTest {

    @Test
    public void TestChoisirModeTrue() {
        assertTrue("On test si on a la bonne class de generer ici JeuSolo", DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Solo) instanceof JeuSolo);
    }

    @Test
    public void TestChoisirModeFalse() {
        assertFalse("On test si on a la bonne class de generer ici JeuSolo", DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Multi) instanceof JeuSolo);
    }

    @Test
    public void TestChoisirModeMultiTrue() {
        assertTrue("On test si on a la bonne class de generer ici JeuMulti", DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Multi) instanceof JeuMulti);
    }

    @Test
    public void TestChoisirModeMultiFalse() {
        assertFalse("On test si on a la bonne class de generer ici JeuMulti", DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Solo) instanceof JeuMulti);
    }

    @Test
    public void TestChoisirDifTrue() {
        assertTrue("On test si on a la bonne class de generer ici liste", DictionnaireDeMotFactory.creerInstance(DictionnaireDeMotFactory.TypeListe.Liste, "") instanceof ListeDictionnaireDeMot);
    }

    @Test
    public void TestChoisirDifFalse() {
        assertFalse("On test si on a la bonne class de generer une liste", DictionnaireDeMotFactory.creerInstance(DictionnaireDeMotFactory.TypeListe.Fichier, "test.txt") instanceof ListeDictionnaireDeMot);
    }

    @Test
    public void TestChoisirDifFichTrue() {
        assertTrue("On test si on a la bonne class de generer ici un fichier", DictionnaireDeMotFactory.creerInstance(DictionnaireDeMotFactory.TypeListe.Fichier, "test.txt") instanceof FichierDictionnaireDeMot);
    }

    @Test
    public void TestChoisirDifFichiFalse() {
        assertFalse("On test si on a la bonne class de generer ici un fichier", DictionnaireDeMotFactory.creerInstance(DictionnaireDeMotFactory.TypeListe.Liste, "") instanceof FichierDictionnaireDeMot);
    }



    @Test
    public void TestChoisirJeuTrue() {
        assertTrue("On test si on a la bonne class de generer ici Normal", DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Normal) instanceof PenduNormal);
    }

    @Test
    public void TestChoisirJeuFalse() {
        assertFalse("On test si on a la bonne class de generer ici Normal", DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Tordu) instanceof PenduNormal);
    }

    @Test
    public void TestChoisirJeuTorduMultiTrue() {
        assertTrue("On test si on a la bonne class de generer ici Tordu", DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Tordu) instanceof PenduTordu);
    }

    @Test
    public void TestChoisirJeuTorduMultiFalse() {
        assertFalse("On test si on a la bonne class de generer ici Tordu", DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Normal) instanceof PenduTordu);
    }



    /*

    @Test
    public void TestChoisirModeFalse() {
        assertFalse("On test si on a la bonne class de generer ici JeuSolo", DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Multi) instanceof JeuSolo);
    }

    public static ADictionnaireDeMot ChoisirJeu(final TypeJeu type) {
        ADictionnaireDeMot result = null;

        switch (type) {
            case Normal:
                result = new PenduNormal();
                break;

            case Tordu:
                result = new PenduTordu();
                break;

            default:
                break;
        }

        return result;
    }

    public static IDictionnaireDeMot creerInstance(final TypeListe type, final String texte) {
        IDictionnaireDeMot result = null;

        switch (type) {
            case Liste:
                result = new ListeDictionnaireDeMot();
                result.RemplirListe("");
                break;

            case Fichier:
                result = new FichierDictionnaireDeMot();
                result.RemplirListe(texte);
                break;

            default:
                break;
        }

        return result;
    }*/
}
