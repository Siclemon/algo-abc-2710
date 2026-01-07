package exercices;
import java.util.Scanner;

public class exercicePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaine;
        boolean palindrome = true;

        do {
            chaine = sc.nextLine().toLowerCase();
            if (!chaine.substring(chaine.length()-1).equals(".")) {
                System.out.println("mets un point");
            }
        } while (!chaine.substring(chaine.length()-1).equals("."));

        chaine = chaine.replace(" ","");

        if (chaine.length()>1) {
            chaine = chaine.substring(0, chaine.length()-1);

            for (int i = 0; i < chaine.length()/2; i++) {
                if (chaine.charAt(i) != chaine.charAt(chaine.length()-1-i)) {
                    palindrome = false;
                    break;
                }
            }

            if (palindrome) System.out.println("\033[32moui\033[0m");
            else System.out.println("\033[31mnon\033[0m");
            

        } else {
            System.out.println("LA CHAINE EST VIDE");
        }

    }
}
