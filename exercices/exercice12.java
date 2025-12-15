package exercices;
import java.util.Scanner;

class exercice12 {

    public static void main(String[] args) {
        double rayon, aire, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le rayon de la sphère : ");
        rayon = sc.nextDouble();

        aire = 4*Math.pow(rayon, 2)*3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
        volume = Math.PI*Math.pow(rayon,3)*4/3;

        System.out.println("Aire = " + aire);
        System.out.println("Volume = " + volume);

        sc.close();
    }
}