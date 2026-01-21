package exercices;

import java.util.Scanner;

public class exercice13 {
    public static void main(String[] args) {
        double rayon, angle, aire;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le rayon du secteur circulaire : ");
        rayon = sc.nextDouble();

        System.out.println("Veuillez entrer l'angle du secteur circulaire : ");
        angle = sc.nextDouble();

        aire = (angle*Math.pow(rayon,2)*3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679)/360;

        System.out.println("Aire = " + aire);

        sc.close();
    }
}
