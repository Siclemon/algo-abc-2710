package intro;

import java.util.Scanner;

public class x {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n;
    char car; 
    String car2;

    System.out.print("Entrer la taille du X : ");
    n = sc.nextInt();
    System.out.print("Entrer le caractère du X : ");
    car = sc.next().charAt(0);
    System.out.print("Entrer le caractère de fond : ");
    car2 = sc.next();

        for (int i = -n; i <= n; i++) {

            System.out.println(car2.repeat(n-Math.abs(i))+car+car2.repeat(Math.abs(2*Math.abs(i)-1)-((i==0)?(1):(0))) + ((i==0) ? (""):(car)) + car2.repeat(n-Math.abs(i)));

        }

        sc.close();
    }
}
