package com.team2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {

    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Accueil du programme
     *
     * @see accueil
     * @author Mael Veron
     * @return int le niveau de difficulte
     */
    public int accueil()
    {
        System.out.println("Bonjour et bienvenue sur le jeu du pendu de la Suicide Squad");
        System.out.println("Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
        boolean estUnNombre = false;
        int number = 0;
        while (!estUnNombre) {
            try {
                number = (new Scanner(System.in)).nextInt();
                if(number == 1 || number == 2) {
                    estUnNombre = true;
                }else {
                    System.out.println("Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
                    estUnNombre = false;
                }
            }catch(InputMismatchException ex) {
                System.out.println("Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
                estUnNombre = false;
            }catch (NoSuchElementException ex){
                System.out.println("Valeur invalide ! \n Veuillez selectionnez un niveau de difficulte entre 1 (debutant) et 2 (avance) :");
                estUnNombre = false;
            }
        }
        return number;
    }

    public DictionnaireDeMotFactory.Type demandeEndroitDictionnaire()
    {
        System.out.println("Veuillez selectionnez un endroit ou prendre les mots entre 1 (la liste) et 2 (le fichier) :");
        DictionnaireDeMotFactory.Type type = null;
        boolean estUnNombre = false;
        while (!estUnNombre) {
            try {
                final int number = (new Scanner(System.in)).nextInt();
                if(number == 1 || number == 2) {
                    estUnNombre = true;
                    type = number == 1 ? DictionnaireDeMotFactory.Type.Liste : DictionnaireDeMotFactory.Type.Fichier;
                }else {
                    System.out.println("Valeur invalide ! \n Veuillez selectionnez un endroit ou prendre les mots entre 1 (la liste) et 2 (le fichier) :");
                    estUnNombre = false;
                }
            }catch(InputMismatchException ex) {
                System.out.println("Valeur invalide ! \n Veuillez selectionnez un endroit ou prendre les mots entre 1 (la liste) et 2 (le fichier) :");
                estUnNombre = false;
            }catch (NoSuchElementException ex){
                System.out.println("Valeur invalide ! \n Veuillez selectionnez un endroit ou prendre les mots entre 1 (la liste) et 2 (le fichier) :");
                estUnNombre = false;
            }
        }
        return type;
    }

    /**
     * Affiche la phrase de choix d'une lettre
     *
     * @see choixLettre
     * @author Mael Veron
     * @return String la lettre choisit
     */
    public String choixLettre() {

        System.out.println("\nVeuillez choisir une lettre");
        final Scanner console = new Scanner(System.in);
        String lettre = console.nextLine();
        while(lettre.length() != 1 || !Character.isLetter(lettre.charAt(0))) {
            System.out.println("Valeur invalide, entrez une seule lettre !");
            lettre = console.nextLine();
        }
        return lettre;
    }


}
