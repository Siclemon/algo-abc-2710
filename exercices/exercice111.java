package exercices;
import java.util.Scanner;
public class exercice111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] valeurs;
        float moyenne;

        do {
            System.out.println("Veuillez saisir 2 nombres séparés par un espace :");
            input = sc.nextLine();
        } while (input.split(" ").length != 2);

        valeurs = input.split(" ");

        moyenne = (Integer.parseInt(valeurs[0]) + Integer.parseInt(valeurs[1]))/2;

        System.out.println("La moyenne de "+valeurs[0]+" et "+valeurs[1]+" est : "+moyenne);

        
    }
    
}