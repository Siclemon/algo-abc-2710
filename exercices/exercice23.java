package exercices;
import java.util.Scanner;

public class exercice23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double un, deux, trois;

        System.out.print("Valeur a : ");
        a = sc.nextDouble();
        System.out.print("Valeur b : ");
        b = sc.nextDouble();
        System.out.print("Valeur c : ");
        c = sc.nextDouble();

        System.out.println();

        if (a<b && a<c) {
            un = a;
            if (b<c) {
                deux=b;
                trois=c;
            } else {
                deux=c;
                trois=b;
            }
        } else if (b<c && b<a) {
            un = b;
            if (a<c) {
                deux=a;
                trois=c;
            } else {
                deux=c;
                trois=a;
            }
        } else {
            un = c;
            if (b<a) {
                deux=b;
                trois=a;
            } else {
                deux=a;
                trois=b;
            }
        }

        System.out.println(un+"; "+deux+"; "+trois);
        sc.close();
    }
}
