//espacement automatique entre les guirlandes
//alternance custom guirlandes couleurs
//gras random branches
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
            char aguirlande='*';
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
            int typeGuirlande = 0;
            String[] guirlande;
            int compteurGuirlande = 0;
            int numGuirlande;
            String couleurBranche;
            String couleurGuirlande;
            String[] toutesCouleursGuirlande = {"rouge","jaune","blanc","cyan","violet"};


            String reset = "\033[0m";
            String noir = "\033[0;30m";
            //String rouge = "\033[1;91m";
            String vert = "\033[0;32m";
            String jaune = "\033[1;93m";
            //String bleu = "\033[0;94m";
            //String violet = "\033[0;95m";
            //String cyan = "\033[0;96m";
            //String blanc = "\033[0;97m";
            String vertGras = "\033[1;32m";

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
            //SAPIN ALÉATOIRE
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
                aguirlande = optionsGuirlande[rng.nextInt(9)];

                typeGuirlande = rng.nextInt(1,3);
                guirlande = new String[typeGuirlande];
                for (int i=0; i < typeGuirlande; i++){
                    guirlande[i] = Character.toString(optionsGuirlande[rng.nextInt(9)]);
                }


                if (choixNeige == 1) neige = '*';
                else if (choixNeige == 2) neige = ',';
                else if (choixNeige == 3) neige = '.';
                else neige = ' ';

            } else { 
            //SAPIN CUSTOM

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

                System.out.print("Voulez vous des boules ? (oui/non) "); //boules ou pas
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

                if (choixGuirlande.matches(oui)) { //nombres de caractères
                    System.out.print("Quel type de guirlande ? (1=simple, 2+=complexe) ");
                    typeGuirlande = sc.nextInt();
                    sc.nextLine();
                }
                
                    guirlande = new String[typeGuirlande];

                if (typeGuirlande!=0){ //quels caractères pour la guirlande
                    for (int i=0; i<typeGuirlande; i++){
                        System.out.print("Quel visuel de guirlande ? ");
                        guirlande[i] = sc.nextLine();
                    }
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
                        if (rand<50) couleurBranche = vert;
                        else couleurBranche = vertGras;
                        if(j<0) branche = couleurBranche+"/"; //branches normales
                        else if(j>0) branche = couleurBranche+"\\";
                        
                        if (choixBoules.matches(oui) && rand<2*quantiteBoules &&  !avantBoule && nbCouleurs>0) { //boules
                            couleurRandom = rng.nextInt(nbCouleurs);
                            couleurBoule = codesCouleurs.get(listeCouleurs[couleurRandom]);//couleur aléatoire
                            if (rand<quantiteBoules) branche = couleurBoule+"O";
                            else if (rand<2*quantiteBoules) branche = couleurBoule+"o";
                            avantBoule = true;
                        } else avantBoule = false;

                        if (i%3==0 && choixGuirlande.matches(oui)){
                            numGuirlande = compteurGuirlande%typeGuirlande;
                            branche = jaune+guirlande[numGuirlande];
                        }


                    }
                    if (j==0 && (!choixGuirlande.matches(oui) || i%3!=0)) branche = noir+"|"; //tronc

                    System.out.print(branche+reset);
                    }
                System.out.println();
                if (i%3==0 && choixGuirlande.matches(oui)) compteurGuirlande++;
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