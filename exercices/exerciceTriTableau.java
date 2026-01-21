package exercices;
import java.util.Random;

public class exerciceTriTableau {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] tableau = new int[rng.nextInt(5,16)];
        int j=0;
        int min;
        int temp;
        String resultat = "[";

        //remplissage du tableau
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rng.nextInt(101);
        }

        for (int n = 0; n < tableau.length; n++) {

            min = tableau[n];
        
            //recherche du plus petit élément
            for (int i=n; i<tableau.length; i++) {
                if (tableau[i]<=min) {
                    min = tableau[i];
                    j = i;
                }
            }

            //permutation
            temp = tableau[n];
            tableau[n] = tableau[j];
            tableau[j] = temp;
        }


        //affichage du tableau
        for (int i : tableau) {
            resultat += i + " - ";
        }
        resultat = resultat.substring(0,resultat.length()-2) + "]";
        System.out.println("\n"+resultat+"\n");
    }
}
