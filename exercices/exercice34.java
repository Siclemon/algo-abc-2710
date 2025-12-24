package exercices;
import java.util.Arrays;
import java.util.Scanner;

public class exercice34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lettre;
        String chaine = "Le camaque est un brimeau de teuque proche de la phynge.";
        int occurrences = 0;

        chaine ="aaa";

        while (!chaine.substring(chaine.length()-1).equals(".") && chaine.length()>1) {
            System.out.println("entrez la chaine de caractères terminée par un point");
            chaine = sc.nextLine();

            if (chaine.length()<=1) {
                System.out.println("\033[31mLA CHAINE EST VIDE\033[0m\n");
                chaine = "aaa";
            }
        }

        System.out.println("quelle lettre ?");
        lettre = sc.next().charAt(0);


        for (int i = 0; i<chaine.length(); i++) {

            if (chaine.charAt(i)==lettre) occurrences++;

        }
        
        System.out.println();
        if (occurrences!=0) System.out.println("La lettre "+"\033[1;4m"+lettre+"\033[0m"+" est présente "+"\033[1;32;2m"+occurrences+"\033[0m"+" fois.");
        else System.out.println("La lettre "+"\033[1;4m"+lettre+"\033[0m"+" n'est pas présente.");
        System.out.println();
        sc.close();
    }
}
