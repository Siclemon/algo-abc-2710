package exercices;
import java.util.Scanner;

public class exercice14 {
    public static void main(String[] args) {
        double somme, interet, simple, compose;
        int annees;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la somme : ");
        somme = sc.nextDouble();
        System.out.println("Entrez l'intérêt' : ");
        interet = sc.nextDouble()/100;
        System.out.println("Combien d'années ? : ");
        annees = sc.nextInt();

        simple = somme*(1+annees*interet);
        compose = somme*Math.pow((1+interet),annees);

        System.out.println("Valeur acquise avec un interet simple : " + simple + " euros");
        System.out.println("Valeur acquise avec un interet composé : " + compose + " euros");

        sc.close();
    }
}
