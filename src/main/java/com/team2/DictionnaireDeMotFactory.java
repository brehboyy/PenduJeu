package com.team2;

public final class DictionnaireDeMotFactory {

    public enum TypeListe {
        Liste,
        Fichier;
    }

    public enum TypeJeu {
        Normal,
        Tordu;
    }

    private  DictionnaireDeMotFactory() {
        super();
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
    }
}
