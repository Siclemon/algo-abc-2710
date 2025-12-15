package exercices;
import java.util.Scanner;
import java.util.Random;
public class exercice31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reponse, guess=-1, essais=0;
        Random rng = new Random();

        reponse = rng.nextInt(101);

        System.out.println("Trouvez le nombre entre 0 et 100");

        while (reponse!=guess){
            guess = sc.nextInt();
            essais++;

            if (reponse<guess) System.out.println("Plus petit");
            else if (reponse>guess) System.out.println("Plus grand");
        }

        System.out.println("\nBravo, vous avez trouvé en "+essais+" essais !");
        sc.close();
    }
}
