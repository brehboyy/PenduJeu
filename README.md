echo "# PenduJeu" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/brehboyy/PenduJeu.git
git push -u origin master


git remote add origin https://github.com/brehboyy/PenduJeu.git
git push -u origin master

#PENDUJEU

- Utilisation  de SRP (single responsibility principle) du principe SOLID : une classe, une fonction ou une méthode doit avoir une et une seule responsabilité

Convention de nommage : 

- Nom des classes : MaClasse
- Commentaire de debut de classes :
'''java
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
'''


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

Commentaires :

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

- Les commentaire sur une ligne (donc pas en fin de ligne) : 
    /* commentaires utiles au code */
        
- Les commentaires en fin de ligne
    i++;         // commentaires utiles au code
- Une seule declaration par ligne 
    String nom;
    String prenom;

- Les commentaires à l'intérieur des méthodes ne doivent pas être trop nombreuses car sinon cela signifie que le code est trop compliqué

- Exemple de declaration de classe
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
    
Git :

La master est la branche réservé à la livraison.
La develop est la branche depuis laquelle les autres branches sont tirées et dans laquelle elles sont mergées.

Pour chaque fonctionnalité et chaque ano, on fait une branche
Le nom des branches correspond à la fonctionnalité développée, qu’elle concerne une US ou bien une correction d’anomalie.
- Nom des branches :
    - si c'est une fonctionnalité : fb-nomjira
    - si c'est une correction ano : hf-nomjira

- Message de commit :
    - Chaque message de commit doit respecter un pattern particulier :
        - Débute par :    
            [TECH] :  Lors d'un commit lié simplement à une tâche technique
            [ANO]  :  Lors d'un commit lié à une anomalie
            [EVO]  :  Lors d'un commit lié à une évolution
        [TECH/ANO/EVO][NuméroDuJira(JDP-10 par exemple)] NomDuJira - explications complémentaires
Les commits doivent être de taille normale.
Les messages de commit sont importants

    