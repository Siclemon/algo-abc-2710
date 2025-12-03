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
            
            System.out.print("Entrer la taille du sapin : ");
            taille = sc.nextInt();
            
            do {
                System.out.print("Voulez vous un cimier ? (oui/non) ");
                choixPointe = sc.next();
            } while (!choixPointe.equals("oui") && !choixPointe.equals("non"));
            
            
            
            //pointe du sapin
            if(choixPointe.equals("oui")) {
                if(taille <= 5) pointe = '*';
                if(5 < taille && taille <= 11) pointe = 'x';
                if(taille > 11) pointe = 'X';
            } else pointe = '^';
            
            System.out.println(" ".repeat(taille) + pointe);
            
            
            //branchage
            for (int i = 1; i <= taille; i++) {
                
                System.out.println(" ".repeat(taille-i) + "/".repeat(i)+"|" + "\\".repeat(i));
                
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
