//package intro;

import java.util.Scanner;

public class boole {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean a, b, c;
        boolean résultat;

        System.out.print("Valeur de a : ");
        a = sc.nextBoolean();
        System.out.print("Valeur de b : ");
        b = sc.nextBoolean();
        System.out.print("Valeur de c : ");
        c = sc.nextBoolean();

        résultat = a || (b && !c);
        System.out.println(a+" OU "+b+" ET NON "+c+" = "+résultat);

        sc.close();
    }

}
