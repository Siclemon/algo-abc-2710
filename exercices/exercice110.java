package exercices;
import java.util.Scanner;

public class exercice110 {
    public static void main(String[] args) {
        int parfaits=0;
        int nombre=0;
        int somme;
        int n=4;
        int[] liste;
        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de nombres parfaits ?");
        n = sc.nextInt();

        liste = new int[n];

        while (parfaits<n) {

            nombre++;
            somme = 0;

            //somme des diviseurs
            for (int i=1; i<=nombre/2; i++) {
                if (nombre%i==0) somme += i;
            }

            //parfait ?
            if (somme==nombre) {
                liste[parfaits] = nombre;
                parfaits++;
            }
        }
        System.out.println();
        for (int el : liste)
            System.out.println("\033[34m"+el+ "\033[0m est un nombre parfait.");
        System.out.println();

        sc.close();

    }
    
}
