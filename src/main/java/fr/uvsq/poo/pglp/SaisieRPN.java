package fr.uvsq.poo.pglp;
import java.util.Scanner;

/**
 * Classe qui gère les interactions avec l’utilisateur et invoque le moteur RPN
 */
public class SaisieRPN {

    /**
     * Construire la Saisie de l’utilisateur.
     */
    public SaisieRPN () {

    }

    public void scanner() {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Veuillez saisir un premier entier : " );
        int i = scanner.nextInt();
        System.out.print( i );

    }
}
