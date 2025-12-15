package exercices;
import java.util.Scanner;

public class exercice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Valeur a : ");
        a = sc.nextInt();
        System.out.println("Valeur b : ");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println();
        System.out.println("Valeur a : "+a);
        System.out.println("Valeur b : "+b);
        
        sc.close();
    }
}
