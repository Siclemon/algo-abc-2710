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
            String pointe = "^";
            int rand;
            String branche;
            int choixNeige;
            char neige;
            int quantiteNeige = 0;
            String choixBoules;
            String choixGuirlande;
            char guirlande='*';

            String reset = "\033[0m";
            String noir = "\033[0;30m";
            String rouge = "\033[0;91m";
            String vert = "\033[0;32m";
            String jaune = "\033[0;93m";
            String bleu = "\033[0;94m";
            String violet = "\033[0;95m";
            String cyan = "\033[0;96m";
            String blanc = "\033[0;97m";
            
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
            if (neige !=' ') {
                System.out.print("Quelle quantité de neige ? (0/1/2/3+) ");
                quantiteNeige = sc.nextInt();
                quantiteNeige = 10*quantiteNeige;
            }

            System.out.print("Voulez vous des boules ? (oui/non) ");
            choixBoules = sc.next();   

            System.out.print("Voulez vous une guirlande ? (oui/non) ");
            choixGuirlande = sc.next();
            if (choixGuirlande.equalsIgnoreCase("oui")) {
                System.out.print("Quel type de guirlande ? ");
                guirlande = sc.next().charAt(0);
            }


            //pointe du sapin
            if(choixPointe.equals("oui")) {
                if(taille <= 5) pointe = jaune+"*";
                else if(5 < taille && taille <= 11) pointe = jaune+"x";
                else if(taille > 11) pointe = jaune+"X";
            } else pointe = vert+"^";
            System.out.println(" ".repeat(taille) + pointe);
            
            
            //branchage
            for (int i = 1; i <= taille; i++) {
                for (int j = -taille; j <= taille; j++) {
                    rand = rng.nextInt(119);

                    branche = " ";
                    if (rand<quantiteNeige) branche = Character.toString(neige); //neige
                    if (Math.abs(j)<=i) {
                        if(j<0) branche = vert+"/"; //branches normales
                        else if(j>0) branche = vert+"\\";
                        
                        if (rand<5 && choixBoules.equals("oui")) branche = rouge+"O"; //boules
                        else if (rand>=5 && rand<10 && choixBoules.equals("oui")) branche = bleu+"o";

                        if (i%3==0 && choixGuirlande.equalsIgnoreCase("oui")) branche = jaune+Character.toString(guirlande); //guirlande
                    }
                    if (j==0 && (!choixGuirlande.equalsIgnoreCase("oui") || i%3!=0)) branche = noir+"|"; //tronc

                    System.out.print(branche+reset);
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
                    System.out.println(" ".repeat(taille-tronc/2)+noir+"|".repeat(tronc+1)+reset);
                }
            }


            sc.close();
}}