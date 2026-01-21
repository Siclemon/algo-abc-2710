package exercices;
import java.util.Scanner;

public class exercice21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Veuillez entre votre âge : ");
        a = sc.nextInt();

        if (a>=18) System.out.println("Vous êtes majeur");
        else if (a<0) System.out.println("Vous n'êtes pas encore né.e");
        else System.out.println("Vous êtes mineur");

        sc.close();
    }
}
