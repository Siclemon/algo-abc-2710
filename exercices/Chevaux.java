package exercices;

import java.util.Scanner;

public class Chevaux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ordre, desordre;

        System.out.println("cb chevaux partants ?");
        int partants = sc.nextInt();
        System.out.println("cb chevaux joués ?");
        int joues = sc.nextInt();

        ordre = factorielle(partants)/factorielle(partants-joues);
        desordre = factorielle(partants)/(factorielle(joues)*factorielle(partants-joues));
        System.out.println(ordre + " - " + desordre);

        sc.close();
    }

    static long factorielle(int n) {
        long fact = n;
        for (int i=1; i<n; i++)
            fact *= i;
        return fact;
    }
}
