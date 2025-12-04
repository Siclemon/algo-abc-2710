package intro;

import java.util.Random;
import java.util.Scanner;

public class sapin {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rng = new Random();
            int taille;
            int tronc;
            String choixPointe;
            char pointe = '^';
            int rand;
            char branche;
            int choixNeige;
            char neige;
            int quantiteNeige;
            String choixBoules;
            
            System.out.print("Quelle taille de sapin ? ");
            taille = sc.nextInt();
            
            System.out.print("Voulez vous un cimier ? (oui/non) ");
            choixPointe = sc.next();            

            System.out.print("Quel type de neige ? (0/1/2/3) ");
            choixNeige = sc.nextInt();
            if (choixNeige == 1) neige = '*';
            else if (choixNeige == 2) neige = ',';
            else if (choixNeige == 3) neige = '.';
            else neige = ' ';

            System.out.print("Quelle quantité de neige ? (0/1/2/3) ");
            quantiteNeige = sc.nextInt();
            quantiteNeige = 10*quantiteNeige;

            System.out.print("Voulez des boules ? (oui/non) ");
            choixBoules = sc.next();   


            //pointe du sapin
            if(choixPointe.equals("oui")) {
                if(taille <= 5) pointe = '*';
                else if(5 < taille && taille <= 11) pointe = 'x';
                else if(taille > 11) pointe = 'X';
            } else pointe = '^';
            System.out.println(" ".repeat(taille) + pointe);
            
            
            //branchage
            for (int i = 1; i <= taille; i++) {
                for (int j = -taille; j <= taille; j++) {
                    rand = rng.nextInt(119);

                    branche = ' ';
                    if (rand<quantiteNeige) branche = neige;
                    if (Math.abs(j)<=i) {
                        if(j<0) branche = '/';
                        if(j>0) branche = '\\';
                        if (rand<5 && choixBoules.equals("oui")) branche = 'O';
                        if (rand>=5 && rand<10 && choixBoules.equals("oui")) branche = 'o';
                    }
                    if (j==0) branche = '|';

                    System.out.print(branche);
                    }
                System.out.println();
                
            }
            
            tronc = taille/4;
            tronc = tronc % 2 + tronc;
            
            //tronc
            if (taille < 5) {
                System.out.println(" ".repeat(taille)+"|");
            }else {
                for (int i = 0; i < taille/8+1; i++) {
                    System.out.println(" ".repeat(taille-tronc/2)+"|".repeat(tronc+1));
                }
            }


            sc.close();
}}