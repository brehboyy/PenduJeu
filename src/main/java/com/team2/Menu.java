package com.team2;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * Cette classe va permettre a l'utilisateur de faire des entrer clavier
 *
 * @version 1.0
 *
 * @see DessinPendu
 * @author Ousmane Diarra
 */
public class Menu {

    Scanner scan;

    public Menu() {
        this.scan = new Scanner(System.in);
    }

    /**
     * Accueil du programme.
     *
     * @see selectDifficulte
     * @author Mael Veron
     * @return int le niveau de difficulte
     */
    public int selectDifficulte() {
        System.out.println("Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
        final String messageErreur = "Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte"
                + " entre 1 (debutant) et 2 (avance) :";
        boolean estUnNombre = false;
        int number = 0;
        this.scan.reset();
        while (!estUnNombre) {
            try {
                if (scan.hasNextInt()) {
                    number = this.scan.nextInt();
                    if (number == 1 || number == 2) {
                        estUnNombre = true;
                    } else {
                        System.out.println(messageErreur);
                    }
                } else {
                    this.scan.next();
                    System.out.println(messageErreur);
                }
            } catch (InputMismatchException ex) {
                System.out.println(messageErreur);
            } catch (NoSuchElementException ex) {
                System.out.println(messageErreur);
            }
        }
        return number;
    }

    /**Selectionne le mode de jeu.
     *
     * @see selectMode
     * @author Ousmane Diarra
     * @return Stirng le nom du fichier
     */
    public DictionnaireDeMotFactory.TypeMode selectMode() {
        System.out.println("Veuillez selectionnez mode de Jeu entre 1 (Solo) et 2 (Multi) :");
        final String messageErreur = "Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte"
                + " entre 1 (debutant) et 2 (avance) :";
        boolean estUnNombre = false;
        int number = 0;
        this.scan.reset();
        while (!estUnNombre) {
            try {
                if (scan.hasNextInt()) {
                    number = this.scan.nextInt();
                    if (number == 1 || number == 2) {
                        estUnNombre = true;
                    } else {
                        System.out.println(messageErreur);
                    }
                } else {
                    this.scan.next();
                    System.out.println(messageErreur);
                }
            } catch (InputMismatchException ex) {
                System.out.println(messageErreur);
            } catch (NoSuchElementException ex) {
                System.out.println(messageErreur);
            }
        }
        return number == 1 ? DictionnaireDeMotFactory.TypeMode.Solo : DictionnaireDeMotFactory.TypeMode.Multi;
    }

    /**
     * Demandele nom du fichier.
     *
     * @see demandeNomFichier
     * @author Mael Veron
     * @return Stirng le nom du fichier
     */
    public String demandeNomFichier() {
        System.out.println("Choississez le nom du fichier :");
        this.scan.reset();
        String nomFichier = this.scan.nextLine();
        final Path path = Paths.get(nomFichier);
        final boolean fileExist = Files.exists(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
        while (fileExist) {
            System.out.println("Le fichier n'existe pas, rentrez en un autre :");
            if (this.scan.hasNext()) {
                nomFichier = this.scan.nextLine();
            }
        }
        return nomFichier;
    }

    /**
     * Demande quel dictionnaire.
     *
     * @see demandeEndroitDictionnaire
     * @author Mael Veron
     * @return DictionnaireDeMotFactory.Type le type choisit
     */
    public DictionnaireDeMotFactory.TypeListe demandeEndroitDictionnaire() {
        System.out
                .println("Veuillez selectionnez un endroit ou prendre les mots entre 1 (la liste) et 2 (le fichier) :");
        DictionnaireDeMotFactory.TypeListe type = null;
        final String messageErreur = "Valeur invalide ! \n Veuillez selectionnez un endroit"
                + " ou prendre les mots entre 1 (la liste) et 2 (le fichier) :";
        boolean estUnNombre = false;
        this.scan.reset();
        while (!estUnNombre) {
            try {
                if (this.scan.hasNextInt()) {
                    final int number = this.scan.nextInt();
                    if (number == 1 || number == 2) {
                        estUnNombre = true;
                        type = number == 1 ? DictionnaireDeMotFactory.TypeListe.Liste
                                : DictionnaireDeMotFactory.TypeListe.Fichier;
                    } else {
                        System.out.println(messageErreur);
                    }
                } else {
                    this.scan.next();
                    System.out.println(messageErreur);
                }
            } catch (InputMismatchException ex) {
                System.out.println(messageErreur);
            } catch (NoSuchElementException ex) {
                System.out.println(messageErreur);
            }
        }
        return type;
    }


    /**
     * Demande quel dictionnaire.
     *
     * @see demandeEndroitDictionnaire
     * @author Mael Veron
     * @return DictionnaireDeMotFactory.Type le type choisit
     */
    public DictionnaireDeMotFactory.TypeJeu demandeJeu() {
        System.out
                .println("Veuillez selectionnez le jeu entre 1 (le normal) et 2 (le tordu) :");
        DictionnaireDeMotFactory.TypeJeu type = null;
        final String messageErreur = "Valeur invalide ! \n Veuillez selectionnez "
                + " le jeu entre 1 (le normal) et 2 (le tordu) :";
        boolean estUnNombre = false;
        this.scan.reset();
        while (!estUnNombre) {
            try {
                if (this.scan.hasNextInt()) {
                    final int number = this.scan.nextInt();
                    if (number == 1 || number == 2) {
                        estUnNombre = true;
                        type = number == 1 ? DictionnaireDeMotFactory.TypeJeu.Normal
                                : DictionnaireDeMotFactory.TypeJeu.Tordu;
                    } else {
                        System.out.println(messageErreur);
                    }
                } else {
                    this.scan.next();
                    System.out.println(messageErreur);
                }
            } catch (InputMismatchException ex) {
                System.out.println(messageErreur);
            } catch (NoSuchElementException ex) {
                System.out.println(messageErreur);
            }
        }
        return type;
    }

    /**
     * Affiche la phrase de choix d'une lettre.
     *
     * @see choixLettre
     * @author Mael Veron
     * @return String la lettre choisit
     */
    public String choixLettre() {

        System.out.println("\nVeuillez choisir une lettre");
        this.scan.reset();
        String lettre = this.scan.nextLine();
        while (lettre.length() != 1 || !Character.isLetter(lettre.charAt(0))) {
            System.out.println("Valeur invalide, entrez une seule lettre !");
            lettre = this.scan.nextLine();
        }

        return lettre;
    }

    /**
     * Permet de saisir un nombre.
     *
     * @see choixNombre
     * @author OusmaneDiarra
     * @return int le niveau de difficulte
     */
    public int choixNombre() {
        final String messageErreur = "Valeur invalide ! \n Veuillez choisir un nombre";
        boolean estUnNombre = false;
        int number = 0;
        this.scan.reset();
        while (!estUnNombre) {
            try {
                if (scan.hasNextInt()) {
                    number = this.scan.nextInt();
                    estUnNombre = true;
                } else {
                    this.scan.next();
                    System.out.println(messageErreur);
                }
            } catch (InputMismatchException ex) {
                System.out.println(messageErreur);
            } catch (NoSuchElementException ex) {
                System.out.println(messageErreur);
            }
        }
        return number;
    }
}
