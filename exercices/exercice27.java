package exercices;
import java.util.Scanner;

public class exercice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometres, miles;
        String valeur="1";

        System.out.println("Valeur en kilomètres :");

        do {
            valeur = sc.next();

            if (valeur.equalsIgnoreCase("q")) {
                sc.close();
                return;
            }
        } while (Double.parseDouble(valeur)<0.01 || Double.parseDouble(valeur)>1000000);

        kilometres = Double.parseDouble(valeur);
        miles = kilometres/1.609;

        System.out.println();
        System.out.println(kilometres +" km valent "+miles+" miles.");
        sc.close();
    }
    
}