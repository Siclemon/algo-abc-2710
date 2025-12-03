package intro;

import java.util.Scanner;

public class sapin {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int taille;

    System.out.println("Entrer la taille du sapin : ");
    taille = sc.nextInt();

    for (int i = 1; i <= taille; i++) {

        System.out.println(" ".repeat(taille-i) + "/".repeat(i)+"|" + "\\".repeat(i));

    }

    if (taille < 5) {
            System.out.println(" ".repeat(taille)+"|");
    }else {
        for (int i = 0; i < taille/8+1; i++) {
            System.out.println(" ".repeat(taille-1)+"|||");
        }
    }

    sc.close();
}}
