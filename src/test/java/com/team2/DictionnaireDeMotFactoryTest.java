package com.team2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public final class DictionnaireDeMotFactoryTest {

    @Test
    public void testChoisirModeTrue() {
        assertTrue("On test si on a la bonne class de generer ici JeuSolo",
                DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Solo) instanceof JeuSolo);
    }

    @Test
    public void testChoisirModeFalse() {
        assertFalse("On test si on a la bonne class de generer ici JeuSolo",
                DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Multi) instanceof JeuSolo);
    }

    @Test
    public void testChoisirModeMultiTrue() {
        assertTrue("On test si on a la bonne class de generer ici JeuMulti",
                DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Multi) instanceof JeuMulti);
    }

    @Test
    public void testChoisirModeMultiFalse() {
        assertFalse("On test si on a la bonne class de generer ici JeuMulti",
                DictionnaireDeMotFactory.ChoisirMode(DictionnaireDeMotFactory.TypeMode.Solo) instanceof JeuMulti);
    }

    @Test
    public void testChoisirDifTrue() {
        assertTrue("On test si on a la bonne class de generer ici liste",
                DictionnaireDeMotFactory.creerInstance(
                        DictionnaireDeMotFactory.TypeListe.Liste, "") instanceof ListeDictionnaireDeMot);
    }

    @Test
    public void testChoisirDifFalse() {
        assertFalse("On test si on a la bonne class de generer une liste",
                DictionnaireDeMotFactory.creerInstance(
                        DictionnaireDeMotFactory.TypeListe.Fichier, "test.txt") instanceof ListeDictionnaireDeMot);
    }

    @Test
    public void testChoisirDifFichTrue() {
        assertTrue("On test si on a la bonne class de generer ici un fichier",
                DictionnaireDeMotFactory.creerInstance(
                        DictionnaireDeMotFactory.TypeListe.Fichier, "test.txt") instanceof FichierDictionnaireDeMot);
    }

    @Test
    public void testChoisirDifFichiFalse() {
        assertFalse("On test si on a la bonne class de generer ici un fichier",
                DictionnaireDeMotFactory.creerInstance(
                        DictionnaireDeMotFactory.TypeListe.Liste, "") instanceof FichierDictionnaireDeMot);
    }



    @Test
    public void testChoisirJeuTrue() {
        assertTrue("On test si on a la bonne class de generer ici Normal",
                DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Normal) instanceof PenduNormal);
    }

    @Test
    public void testChoisirJeuFalse() {
        assertFalse("On test si on a la bonne class de generer ici Normal",
                DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Tordu) instanceof PenduNormal);
    }

    @Test
    public void testChoisirJeuTorduMultiTrue() {
        assertTrue("On test si on a la bonne class de generer ici Tordu",
                DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Tordu) instanceof PenduTordu);
    }

    @Test
    public void testChoisirJeuTorduMultiFalse() {
        assertFalse("On test si on a la bonne class de generer ici Tordu",
                DictionnaireDeMotFactory.ChoisirJeu(DictionnaireDeMotFactory.TypeJeu.Normal) instanceof PenduTordu);
    }
}
