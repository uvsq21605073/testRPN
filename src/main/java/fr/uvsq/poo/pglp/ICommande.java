package fr.uvsq.poo.pglp;

/**
 *  Interface représentant la commande invoquée.
 */
public interface ICommande {
   /**
    *  Action à exécuter par l'invoqueur.
    * @throws DivisionNullException lancer exception division par zero.
    */
   void apply() throws DivisionNullException;

}
