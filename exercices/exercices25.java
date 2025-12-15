package exercices;
import java.util.Scanner;

public class exercices25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;

        System.out.println("Nombre entier :");
        nombre = sc.nextInt();

        System.out.println();
        for (int i=2; i<nombre; i++){

            if (nombre%i==0) System.out.println(i);

        }
        sc.close();
    }
}
