package com.team2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Classe contenant le dictionnaire de mot du pendu.
 *
 *
 * @version 1.0
 *
 * @see FichierDictionnaireDeMot
 * @author Ousmane Diarra
 */
public class FichierDictionnaireDeMot implements IDictionnaireDeMot {

    public List<String> listMots;

    public void remplirListe(final String nomFichier) {
        try (BufferedReader buff = new BufferedReader(
                new InputStreamReader(new FileInputStream(nomFichier), "UTF-8"))){
            String ligne;
            this.listMots = new ArrayList<String>();
            while ((ligne = buff.readLine()) != null) {
                listMots.add(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Recuperation d'un mot alearoirement parmis les mots dur donc les mot qui font
     * minimum 5 caractere.
     *
     * @return Le mot que l'utilisateur du pendu devra trouver
     *
     * @see getMotDur
     * @author Ousmane Diarra
     */
    @Override
    public String getMotDur() {

        final List<String> listMotsDur = this.listMots.stream().filter(c -> c.length() > 4)
                .collect(Collectors.toList());

        final int indexAlea = new Random().nextInt(listMotsDur.size());
        return listMotsDur.get(indexAlea);
    }

    /**
     * Recuperation d'un mot alearoirement parmis les mots dur donc les mot qui font
     * minimum 5 caractere.
     *
     * @return Le mot que l'utilisateur du pendu devra trouver
     *
     * @see getMotDur
     * @author Ousmane Diarra
     */
    @Override
    public String getMotFacile() {

        final List<String> listMotsFacile =
                this.listMots.stream().filter(c -> c.length() == 4 || c.length() == 3)
                .collect(Collectors.toList());

        final int indexAlea = new Random().nextInt(listMotsFacile.size());
        return listMotsFacile.get(indexAlea);
    }
}
