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

@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class FichierDictionnaireDeMot implements IDictionnaireDeMot {

    public List<String> listMots;
    public static List<String> lstMotPrec = new ArrayList<String>();

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

        final List<String> listMotsDur = this.listMots.stream().filter(mot -> (mot.length() > 4) &&
                !lstMotPrec.contains(mot)).collect(Collectors.toList());
        final int indexAlea = new Random().nextInt(listMotsDur.size());
        lstMotPrec.add(listMotsDur.get(indexAlea));
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
                this.listMots.stream().filter(mot -> (mot.length() == 4 || mot.length() == 3) &&
                        !lstMotPrec.contains(mot)).collect(Collectors.toList());

        final int indexAlea = new Random().nextInt(listMotsFacile.size());
        lstMotPrec.add(listMotsFacile.get(indexAlea));
        return listMotsFacile.get(indexAlea);
    }
}
