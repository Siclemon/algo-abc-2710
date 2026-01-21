package exercices;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class exercicePendu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mot;
        char lettre;
        int essais = 6;
        boolean presente;
        boolean[] trouvee;
        int lettresTrouvees = 2;
        ArrayList<Character> lettresTestees = new ArrayList<>();
        boolean dejaTestee;

        System.out.println("quel est le mot ????");
        mot = sc.nextLine().toUpperCase();
        //motAffiche = mot.substring(0,1) + "-".repeat(mot.length()-2) + mot.substring(mot.length()-1);
        System.out.println("\033\143");

        trouvee = new boolean[mot.length()];
        Arrays.fill(trouvee,false);
        trouvee[0] = true;
        trouvee[trouvee.length-1] = true;

        while (essais > 0 && lettresTrouvees!=mot.length()) {
            System.out.print("\033[1m");
            for (int i = 0; i < trouvee.length; i++) {
                if (trouvee[i]) System.out.print(mot.charAt(i));
                else System.out.print("-");
            }
            System.out.print("\033[0m");
            System.out.println("\tEssais restants : " + essais);

            System.out.print("lettre : ");
            lettre = sc.nextLine().toUpperCase().charAt(0);

            presente = false;
            for (int i = 1; i < mot.length()-1; i++) {
                if (lettre == mot.charAt(i) && !trouvee[i]) {
                    presente = true;
                    trouvee[i] = true;
                    lettresTrouvees++;
                }
            }

            dejaTestee = false;
            for (Character car : lettresTestees) {
                if (car == lettre) dejaTestee = true;
            }

            if (!presente && !dejaTestee) essais--;
            lettresTestees.add(lettre);

            System.out.println();
        }


        if (essais>0) {
            System.out.println("\033[32mgg\033[0m");
            System.out.println("Le mot était bien : "+mot.toLowerCase() + ".");
        } else {
            System.out.println("\033[31mperdu\33[0m");
            System.out.println("Le mot était  : "+mot.toLowerCase() + ".");
        }
    }
}
