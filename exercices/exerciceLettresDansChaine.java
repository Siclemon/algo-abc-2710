package exercices;
import java.util.Scanner;

public class exerciceLettresDansChaine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaine;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] occurences = new int[26];

        System.out.println("chaine ?");

        do {
            chaine = sc.nextLine().toLowerCase();
            if (chaine.length()<120) {
                System.out.println("plus long stp");
            }
        } while (chaine.length()<120);

        for (int lettre = 0; lettre < 26; lettre++) {
            for (int j = 0; j < chaine.length(); j++) {
                if (alphabet.charAt(lettre) == chaine.charAt(j)) {
                    occurences[lettre]++;
                }
            }
        }

        System.out.println();
        for (int i=0; i<26; i++) {
            if (occurences[i]>0) {
                System.out.println("La lettre \033[1m"+alphabet.charAt(i)+"\033[0m est présente \033[1m"+occurences[i]+"\033[0m fois.");
            }
        }
        System.out.println();
        

    }
}
