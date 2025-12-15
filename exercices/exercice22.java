package exercices;
import java.util.Scanner;

public class exercice22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Valeur a : ");
        a = sc.nextInt();
        System.out.print("Valeur b : ");
        b = sc.nextInt();

        System.out.println();
        if (a<b) System.out.println(a+"; "+b);
        else System.out.println(b+"; "+a);

        sc.close();
    }
    
}
