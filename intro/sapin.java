//espacement automatique entre les guirlandes
//alternance custom guirlandes
//gras random branches
//neige cimier
//guirlande penchées


package intro;

import java.util.HashMap;
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
            boolean avantBoule=false;
            int nbCouleurs=0;
            String couleurDemandee;
            int couleurRandom;
            String couleurBoule="\033[0;97m";
            int quantiteBoules=0;
            String oui="oui|o|yes|y|1";
            String sapinRandom;
            String[] toutesLesCouleurs = {"rouge","jaune","noir","blanc","bleu","cyan","violet","vert"};
            char[] optionsGuirlande = {'x','X','*','W','O','A','<','>','@'};
            String[] listeCouleurs;
            String[] ouiNon = {"oui","non"};


            String reset = "\033[0m";
            String noir = "\033[0;30m";
            //String rouge = "\033[1;91m";
            String vert = "\033[0;32m";
            String jaune = "\033[1;93m";
            //String bleu = "\033[0;94m";
            //String violet = "\033[0;95m";
            //String cyan = "\033[0;96m";
            //String blanc = "\033[0;97m";

            HashMap<String, String> codesCouleurs = new HashMap<>();
            codesCouleurs.put("noir","\033[1;30m");
            codesCouleurs.put("rouge","\033[1;91m");
            codesCouleurs.put("vert" , "\033[1;32m");
            codesCouleurs.put("jaune" ,"\033[1;93m");
            codesCouleurs.put("bleu", "\033[1;94m");
            codesCouleurs.put("violet", "\033[1;95m");
            codesCouleurs.put("cyan", "\033[1;96m");
            codesCouleurs.put("blanc", "\033[0;97m");

            System.out.print("Sapin aléatoire ? ");
            sapinRandom = sc.nextLine().toLowerCase();
            if (sapinRandom.matches(oui)){
                System.out.print("Quelle taille de sapin ? (0=aléatoire) ");
                taille = sc.nextInt();
                if (taille==0) taille = rng.nextInt(2,41);
                choixPointe = ouiNon[rng.nextInt(2)];
                choixNeige = rng.nextInt(4);
                quantiteNeige = rng.nextInt(4)*10;
                choixBoules = ouiNon[rng.nextInt(2)];
                quantiteBoules = rng.nextInt(1,4)*4;
                nbCouleurs = rng.nextInt(1,5);
                listeCouleurs = new String[nbCouleurs];
                for (int i=0; i < nbCouleurs; i++){
                    listeCouleurs[i] = toutesLesCouleurs[rng.nextInt(8)];
                }
                choixGuirlande = ouiNon[rng.nextInt(2)];
                guirlande = optionsGuirlande[rng.nextInt(9)];

                if (choixNeige == 1) neige = '*';
                else if (choixNeige == 2) neige = ',';
                else if (choixNeige == 3) neige = '.';
                else neige = ' ';


            } else { //custom

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
                quantiteNeige *= 10;
            }

            System.out.print("Voulez vous des boules ? (oui/non) "); //choix des boules
            choixBoules = sc.next().toLowerCase();
            if (choixBoules.matches(oui)) {
                System.out.print("Quelle quantité de boules ? (0/1/2/3+) ");
                quantiteBoules = sc.nextInt();
                quantiteBoules *= 4;
                System.out.print("Combien de couleurs de boules ? ");
                nbCouleurs = sc.nextInt();
                sc.nextLine();
            }

            listeCouleurs = new String[nbCouleurs]; 
            
            if (nbCouleurs!=0){
                System.out.println("Quelles couleurs de boules ? "); //choix des couleurs de boules
                for (int i=0; i < nbCouleurs; i++){
                    couleurDemandee = sc.nextLine().toLowerCase();
                    if (!couleurDemandee.matches("rouge|jaune|noir|blanc|bleu|cyan|violet|vert")){
                        i--;
                        System.out.println("Veuillez entrer une couleur valide (rouge/jaune/noir/blanc/bleu/cyan/violet/vert)");
                    } else listeCouleurs[i] = couleurDemandee;
                }
            }
            

            System.out.print("Voulez vous une guirlande ? (oui/non) "); //guirlande
            choixGuirlande = sc.next().toLowerCase();
            if (choixGuirlande.matches(oui)) {
                System.out.print("Quel type de guirlande ? ");
                guirlande = sc.next().charAt(0);
            }
        }


            //POINTE DU SAPIN
            //détermination du cimier
            if(choixPointe.matches(oui)) {
                if(taille <= 5) pointe = jaune+"*";
                else if(5 < taille && taille <= 11) pointe = jaune+"x";
                else if(taille > 11) pointe = jaune+"X";
            } else pointe = vert+"^";
            //afichage de la première ligne
            for (int i = -taille; i <= taille; i++) {
                    rand = rng.nextInt(100);

                    branche = " ";
                    if (rand<quantiteNeige) branche = Character.toString(neige); //neige
                    if (i==0) branche = pointe; //cimier
                    System.out.print(branche+reset);
            }
            System.out.println();

            
            //BRANCHAGE
            for (int i = 1; i <= taille; i++) {
                for (int j = -taille; j <= taille; j++) {
                    rand = rng.nextInt(100);

                    branche = " ";
                    if (rand<quantiteNeige) branche = Character.toString(neige); //neige
                    if (Math.abs(j)<=i) {
                        if(j<0) branche = vert+"/"; //branches normales
                        else if(j>0) branche = vert+"\\";
                        
                        if (choixBoules.matches(oui) && rand<2*quantiteBoules &&  !avantBoule && nbCouleurs>0) { //boules
                            couleurRandom = rng.nextInt(nbCouleurs);
                            couleurBoule = codesCouleurs.get(listeCouleurs[couleurRandom]);//couleur aléatoire
                            if (rand<quantiteBoules) branche = couleurBoule+"O";
                            else if (rand<2*quantiteBoules) branche = couleurBoule+"o";
                            avantBoule = true;
                        } else avantBoule = false;

                        if (i%3==0 && choixGuirlande.matches(oui)) branche = jaune+Character.toString(guirlande); //guirlande
                    }
                    if (j==0 && (!choixGuirlande.matches(oui) || i%3!=0)) branche = noir+"|"; //tronc

                    System.out.print(branche+reset);
                    }
                System.out.println();
                
            }
            
            
            //TRONC
            tronc = taille/4;
            tronc = tronc % 2 + tronc;
            if (taille < 5) {
                System.out.println(" ".repeat(taille)+noir+"|"+reset);
            }else {
                for (int i = 0; i < taille/8+1; i++) {
                    System.out.println(" ".repeat(taille-tronc/2)+noir+"|".repeat(tronc+1)+reset);
                }
            }

            sc.close();
}}