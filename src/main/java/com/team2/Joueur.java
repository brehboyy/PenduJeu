package com.team2;

@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class Joueur {
    private String nom;
    private int nbEssai;
    private boolean active;

    public Joueur(final String nom, final int nbEssai, final boolean active) {
        super();
        this.nom = nom;
        this.nbEssai = nbEssai;
        this.active = active;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public int getNbEssai() {
        return nbEssai;
    }

    public void setNbEssai(final int nbEssai) {
        this.nbEssai = nbEssai;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public static Joueur setJoueur(final String nom, final int nbEssai, final boolean active) {
        return new Joueur(nom, nbEssai, active);
    }

}
