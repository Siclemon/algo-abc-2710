package exercices;
import java.util.Arrays;
import java.util.Scanner;

public class exercice232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] liste = {0,0,0};

        System.out.print("Valeur a : ");
        liste[0] = sc.nextDouble();
        System.out.print("Valeur b : ");
        liste[1] = sc.nextDouble();
        System.out.print("Valeur c : ");
        liste[2] = sc.nextDouble();

        Arrays.sort(liste);
        System.out.println();

        for (int i=0; i<liste.length; i++)
            System.out.println(liste[i]);
       
        sc.close();
    }
}
