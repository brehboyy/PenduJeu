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
    public enum TypeMode {
        Multi,
        Solo;
    }

    private  DictionnaireDeMotFactory() {
        super();
    }

    @SuppressWarnings(value = { "all" })
    public static AJeu choisirMode(final TypeMode type) {
        AJeu result = null;

        switch (type) {
            case Multi:
                result = new JeuMulti();
                break;

            case Solo:
                result = new JeuSolo();
                break;

            default:
                break;
        }

        return result;
    }

    @SuppressWarnings(value = { "all" })
    public static ADictionnaireDeMot choisirJeu(final TypeJeu type) {
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

    @SuppressWarnings(value = { "all" })
    public static IDictionnaireDeMot creerInstance(final TypeListe type, final String texte) {
        IDictionnaireDeMot result = null;

        switch (type) {
            case Liste:
                result = new ListeDictionnaireDeMot();
                result.remplirListe("");
                break;

            case Fichier:
                result = new FichierDictionnaireDeMot();
                result.remplirListe(texte);
                break;

            default:
                break;
        }

        return result;
    }
}
