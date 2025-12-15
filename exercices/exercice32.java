//package exercices;
import java.util.Scanner;
public class exercice32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, magasins=0;

        System.out.println("Combien d'argent a Barnabé ?");
        s = sc.nextInt();

        while (s>0){
            magasins++;
            if (s>s/2 - 1) s = s/2 - 1;
            else s=0;

        }
        System.out.println("Barnabé a fait ses courses dans "+magasins+" magasin(s).");
        sc.close();
    }
    
}
