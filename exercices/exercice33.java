package exercices;
import java.util.Scanner;
public class exercice33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        int[] tableau = {1,2,3,4,5,6,7,8,9,10,15,45,56,4815};
        boolean trouvé=false;

        System.out.print("Valeur à chercher : ");
        n = sc.nextInt();

        for (i=0; i<tableau.length; i++) {
            if (tableau[i] == n) {
                trouvé = true;
                break;
            }
            if (tableau[i]>n) break;
        }
        
        System.out.println();
        if(trouvé) System.out.println(n+" est présent en position "+i);
        else System.out.println("404 Not Found");

        sc.close();
    }
    
}
