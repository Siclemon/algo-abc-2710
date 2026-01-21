package exercices;

import java.util.Scanner;

public class exercice26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre,i=1;

        System.out.println("Nombre entier :");
        nombre = sc.nextInt();

        System.out.println();
        
        for (i=2; nombre%i!=0 && i<nombre; i++);

        if (i==nombre) System.out.println(nombre+" est un nombre premier !");
        else System.out.println(nombre+" n'est pas un nombre premier :(");

        sc.close();
    }
}
