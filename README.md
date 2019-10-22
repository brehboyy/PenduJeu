echo "# PenduJeu" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/brehboyy/PenduJeu.git
git push -u origin master


git remote add origin https://github.com/brehboyy/PenduJeu.git
git push -u origin master


Convention de nommage : 
- Nom des class : MaClasse
- Commentaire de debut de class :

    /**
    * Nom de classe : MaClasse
    *
    * Description   : description de la classe et de son rôle 
    *
    * Version       : 1.0
    *
    * Date          : 23/02/2001
    * 
    * Copyright     : moi
    */

    /**
    * description de la classe.
    * explication supplémentaire si nécessaire
    * 
    * @version 1.0
    *
    * @see UneAutreClasse
    * @author Jean Michel D.
    */

    - Nom des package : Tout minuscule "monpackage"

- Les différents éléments qui composent la définition de la classe ou de l'interface devraient être indiqués dans l'ordre suivant :
    les commentaires au format javadoc de la classe ou de l'interface
    la déclaration de la classe ou de l'interface
    les variables de classes (déclarées avec le mot clé static) triées par ordre d'accessibilité : d'abord les variables déclarées public, protected, package friendly (sans modificateur d'accès) et enfin private
    les variables d'instances triées par ordre d'accessibilité : d'abord les variables déclarées public, protected, package friendly (sans modificateur d'accès) et enfin private
    le ou les constructeurs
    les méthodes : elles seront regroupées par fonctionnalités plutôt que selon leur accessibilité

- Nom des methodes : 
    /**
    *  Description de la methode
    */

- Commentaire des methodes
        public void maMethode() {
        /** 
        * description de la méthode.
        * explication supplémentaire si nécessaire 
        *  
        * @return      description de la valeur de retour 
        * @param       arg1 description du 1er argument 
        *    :           :         : 
        * @param       argN description du Neme argument 
        * @exception   Exception1  description de la première exception 
        *    :           :         : 
        * @exception ExceptionN  description de la Neme exception 
        * 
        * @see UneAutreClasse#UneAutreMethode 
        * @author   Jean Dupond 
        **/

- Les commentaire sure une ligne (donc pas en fin de ligne) : 
    /* commentaires utiles au code */
        
- Les commentaire en fin de ligne
    i++;         // commentaires utiles au code

- Une seule declaration par ligne 
    String nom;
    String prenom;
    
- Exemple de declaration de class
    class Employe extends Personne {
        int matricule;
        Employee() {
            super();
            matricule = -1;
        }
        
        Employee(String nom, String prenom, int age, int matricule) {
            super(nom, prenom, age);
            this.matricule = matricule;
        }
    }
    