package exercices;
import java.util.Scanner;

public class exercice24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        boolean bissextile;

        System.out.print("Année :");
        a = sc.nextInt();

        bissextile = a%4==0 && a%100!=0 || a%400==0;

        if (bissextile) System.out.println("L'année "+a+" est bissextile.");
        else System.out.println("L'année "+a+" n'est pas bissextile.");
        sc.close();
    }
}
