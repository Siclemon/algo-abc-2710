package exercices;
import java.util.Random;

public class exerciceTriABulle {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] tableau = new int[rng.nextInt(5,16)];
        int temp;
        String resultat = "[";

        //remplissage du tableau
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rng.nextInt(101);
        }

        for (int n = tableau.length-1; n >= 0; n--) {
    
            for (int i=0; i<n; i++) {
                if (tableau[i]>tableau[i+1]) {
                    temp = tableau[i+1];
                    tableau[i+1] = tableau[i];
                    tableau[i] = temp;
                }
            }
        }


        //affichage du tableau
        for (int i=0; i<tableau.length; i++) {
            resultat += "\033[38;2;"+(100+10*i)+";0;0m" + tableau[i] + "\033[0m - ";
        }
        resultat = resultat.substring(0,resultat.length()-2) + "]";
        System.out.println("\n"+resultat+"\n");
    }
}
