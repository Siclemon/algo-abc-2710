package intro;

import java.util.Scanner;

public class hjusdov {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        float résultat;

        System.out.print("Valeur de a : ");
        a = sc.nextFloat();
        System.out.print("Valeur de b : ");
        b = sc.nextFloat();
        System.out.print("Valeur de c : ");
        c = sc.nextFloat();

        résultat = (a * b) / c;
        System.out.println("(" + a + " x " + b + ") / " + c + " = " + résultat);

        sc.close();
    }

}
