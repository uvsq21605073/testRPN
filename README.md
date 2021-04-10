# Exercice 4.2 (Command)

Calculatrice fonctionnant en mode RPN.

Les opérations supportées sont: undo, exit, calcul opérandes, empty (ajouté afin de vider la pile d'opérandes).

## Détails techniques
- Checkstyle version 3.1.2 avec fichier de configuration checkstyle.xml correspondant aux conventions de codage Sun. Le build échoue bien lorsque qu'une convention n'est pas suivie.

- JDK 11 utilisé

- Choix de conception: </br>
Une interface ICommand sera le lien avec l'invoker avec sa méthode apply(). </br>
Chaque action que nous avons implémenter dans des classes séparées implémentera cette interface et est préfixée par "Commande", ce sont les actions concrètes que réalise la calculatrice.</br>
Le CommandFactory fait office de receiver et sa méthode execute(commandName) permet de réaliser les actions concrètes.</br>
 Le programme principal CalculatriceRPN fait appel au CommandFactory par le biais de la SaisieRPN. </br>
Une classe mère Interpreteur implémentant le undo(), exit(), empty()  (méthode ajoutée) est présente. </br>
La classe MoteurRPN hérite de celle-ci et ajoute ces méthodes calculation() afin de calculer les opérandes de la pile ,register() afin de sauvegarder sur la pile les opérandes et result() afin de récupérer les opérandes stockées. </br>
Le pattern Factory a été utiliser en s'inspirant de "Example calculator design" afin de créer l'ensemble des classes Commande. Ce factory est appelé dans le programme principal "CalculatriceRPN". </br>
Enfin, le programme principal utilise le pattern Singleton et l'approche énumération afin de garantir qu'une seule instance de la classe CalculatriceRPN est créée et fournit un accès uniforme à cet objet.




## License
