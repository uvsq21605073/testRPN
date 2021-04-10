package fr.uvsq.poo.pglp;

/**
 * Hello world!
 *
 */
enum CalculatriceRPN {
    /**
     *  Utilisation Pattern Singleton pour CalculatriceRPN.
     * @param args les arguments de la ligne de commande.
     */
    /**
     * enum en charge du programme.
     */
    ENVIRONNEMENT;

    /**
     * Methode afin de run le programme.
     * @param args possibles arguments ligne commande.
     */
    public void run(final String[] args) {
        MoteurRPN moteur = new MoteurRPN();
        SaisieRPN saisie = new SaisieRPN(moteur);
        while (true) {
            saisie.handleInput();
        }
    }

    /**
     * Main afin d'appeler le programme.
     * @param args argument ligne commande.
     */
    public static void main(final String[] args) {
        ENVIRONNEMENT.run(args);
    }
}
