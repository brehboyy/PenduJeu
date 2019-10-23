package com.team2;

public class DictionnaireDeMotFactory {

    public enum Type {
        Liste,
        Fichier;
    }


    public static DictionnaireDeMot creerInstance(final Type type, final String texte) {
        DictionnaireDeMot result = null;

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
    }
}
