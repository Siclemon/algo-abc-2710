//guirlande penchées
//ciel
//côtés
//cadeaux
//neige en bas


//package intro;
/* retiré car donnait:

Error: Could not find or load main class sapin
Caused by: java.lang.NoClassDefFoundError: sapin (wrong name: intro/sapin) */

import java.util.ArrayList;
import java.util.Arrays;
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
            boolean avantBoule=false;
            int nbCouleurs=0;
            String couleurDemandee;
            int couleurBouleRandom;
            String couleurBoule="\033[0;97m";
            int quantiteBoules=0;
            String oui="oui|o|yes|y|1";
            String sapinRandom;
            String[] toutesLesCouleurs = {"rouge","jaune","blanc","bleu","cyan","violet","vert","noir"};
            char[] optionsGuirlande = {'x','X','*','W','O','A','<','>','Z'};
            String[] listeCouleursBoule;
            String[] ouiNon = {"oui","non"};
            int typeGuirlande = 0;
            String[] guirlande;
            int compteurGuirlande = 0;
            int numGuirlande=0;
            String couleurBranche;
            String[] couleursGuirlande;
            String[] toutesCouleursGuirlande = {"rouge","jaune","blanc","cyan","violet"};
            int numCouleurGuirlande;
            int repetitionCouleurGuirlande = 2;
            int seedCouleurGuirlande=0;
            String choixLumiere="0";
            int quantiteLumiere=0;
            String lumiere = "*";
            boolean avantLumiere=false;
            int nbCouleursLumiere=1;
            String[] couleursLumiere;
            String[] toutesCouleursLumiere = {"rouge","jaune","blanc","bleu","cyan","violet","vert"};
            String[] optionsLumiere = {"*","°"};
            int couleurLumiereRandom;
            String couleurLumiere="\033[93;1;5m";
            int nbCouleursGuirlande=0;
            String choixVisuLum;
            String couleurSol;
            int largeur;
            int quantiteNeigeSol;
            String[] couleursSol;
            String[] solNeige1 = {"\033[32;7;2;42m","\033[92;7;2;42m"};
            String[] solNeige2 = {"\033[32;7;2;42m","\033[32;7;2;100m","\033[32;7;2;47m"};
            String[] solNeige3 = {"\033[32;7;2;42m","\033[32;7;2;100m","\033[32;2;47m","\033[37;7;102m"};
            String[] solNeige4 = {"\033[100;2;90m","\033[37;100m","\033[47;90m","\033[32;2;47m","\033[37;7;102m"};
            String[] solNeige5 = {"\033[100;2;90m","\033[37;100m","\033[47;90m","\033[37;7;107m","\033[107;37m"};
            String[] solNeige6 = {"\033[100;2;90m","\033[37;100m","\033[47;90m","\033[37;7;107m","\033[107;37m","\033[107;97m"};
            int inclinaisonGuirlande;
            boolean ligneAGuirlande = false;


            String reset = "\033[0m";
            String noir = "\033[1;30m";
            //String rouge = "\033[1;91m";
            String vert = "\033[9;2;32m";
            String jaune = "\033[1;93m";
            //String bleu = "\033[0;94m";
            //String violet = "\033[0;95m";
            //String cyan = "\033[0;96m";
            String blanc = "\033[1;97m";
            String vertGras = "\033[1;9;2;32m";

            HashMap<String, String> codesCouleurs = new HashMap<>();
            codesCouleurs.put("noir","\033[1;30m");
            codesCouleurs.put("rouge","\033[1;91m");
            codesCouleurs.put("vert" , "\033[1;32m");
            codesCouleurs.put("jaune" ,"\033[1;93m");
            codesCouleurs.put("bleu", "\033[1;94m");
            codesCouleurs.put("violet", "\033[1;95m");
            codesCouleurs.put("cyan", "\033[1;96m");
            codesCouleurs.put("blanc", "\033[1;97m");
            codesCouleurs.put("rougeBarre","\033[1;9;91m");
            codesCouleurs.put("jauneBarre" ,"\033[1;9;93m");
            codesCouleurs.put("violetBarre", "\033[1;9;95m");
            codesCouleurs.put("cyanBarre", "\033[1;9;96m");
            codesCouleurs.put("blancBarre", "\033[1;9;97m");
            codesCouleurs.put("jauneClignotant" ,"\033[1;5;93m");
            codesCouleurs.put("blancClignotant" ,"\033[1;5;97m");
            codesCouleurs.put("rougeClignotant","\033[1;5;91m");
            codesCouleurs.put("vertClignotant" , "\033[1;5;32m");
            codesCouleurs.put("bleuClignotant", "\033[1;5;94m");
            codesCouleurs.put("violetClignotant", "\033[1;5;95m");
            codesCouleurs.put("cyanClignotant", "\033[1;5;96m");

            System.out.print("\nSapin aléatoire ? ");
            sapinRandom = sc.nextLine().toLowerCase();
            //SAPIN ALÉATOIRE
            if (sapinRandom.matches(oui)){

                System.out.print("Quelle taille de sapin ? (0=aléatoire) ");
                taille = sc.nextInt();
                if (taille==0) taille = rng.nextInt(2,55);
                choixPointe = ouiNon[rng.nextInt(2)];
                choixNeige = rng.nextInt(4);
                quantiteNeige = rng.nextInt(1,36);
                choixBoules = ouiNon[rng.nextInt(2)];
                quantiteBoules = rng.nextInt(2,8);
                nbCouleurs = rng.nextInt(1,5);
                listeCouleursBoule = new String[nbCouleurs];
                for (int i=0; i < nbCouleurs; i++){
                    listeCouleursBoule[i] = toutesLesCouleurs[rng.nextInt(7)];
                }
                choixGuirlande = ouiNon[rng.nextInt(2)];

                typeGuirlande = rng.nextInt(1,3);
                guirlande = new String[typeGuirlande];
                for (int i=0; i < typeGuirlande; i++){
                    guirlande[i] = Character.toString(optionsGuirlande[rng.nextInt(9)]);
                }
                couleursGuirlande = new String[rng.nextInt(1,6)];
                for (int i=0; i < couleursGuirlande.length; i++){
                    couleursGuirlande[i] = toutesCouleursGuirlande[rng.nextInt(5)];
                }

                choixLumiere = Integer.toString(rng.nextInt(3));
                quantiteLumiere = rng.nextInt(3,8);
                if(choixLumiere.equals("2")) nbCouleursLumiere = rng.nextInt(4,8);
                couleursLumiere = new String[nbCouleursLumiere];
                for (int i=0; i < couleursLumiere.length; i++){
                    couleursLumiere[i] = toutesCouleursLumiere[rng.nextInt(7)];  
                }
                if (nbCouleursLumiere==1) couleursLumiere[0] = "jaune";
                lumiere = optionsLumiere[rng.nextInt(2)];



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
                    quantiteBoules *= 3;
                    System.out.print("Combien de couleurs de boules ? ");
                    nbCouleurs = sc.nextInt();
                    sc.nextLine();
                }

                listeCouleursBoule = new String[nbCouleurs]; 
                
                if (nbCouleurs!=0){
                    System.out.println("Quelles couleurs de boules ? "); //choix des couleurs de boules
                    for (int i=0; i < nbCouleurs; i++){
                        couleurDemandee = sc.nextLine().toLowerCase();
                        if (!couleurDemandee.matches("rouge|jaune|noir|blanc|bleu|cyan|violet|vert")){
                            i--;
                            System.out.println("Veuillez entrer une couleur valide (rouge/jaune/noir/blanc/bleu/cyan/violet/vert)");
                        } else listeCouleursBoule[i] = couleurDemandee;
                    }
                }
                

                //guirlande
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
                    System.out.print("Combien de couleurs de guirlande ? ");
                    nbCouleursGuirlande = sc.nextInt();
                    sc.nextLine();
                }
                couleursGuirlande = new String[nbCouleursGuirlande]; 
                if (nbCouleursGuirlande!=0){
                    System.out.println("Quelles couleurs de guirlande ? "); //choix des couleurs de guirlande
                    for (int i=0; i < nbCouleursGuirlande; i++){
                        couleurDemandee = sc.nextLine().toLowerCase();
                        if (!Arrays.asList(toutesCouleursGuirlande).contains(couleurDemandee)){
                            i--;
                            System.out.println("Veuillez entrer une couleur valide (rouge/jaune/blanc/cyan/violet)");
                        } else couleursGuirlande[i] = couleurDemandee;
                    }
                }


                //lumières
                System.out.print("Voulez vous une guirlande lumineuse ? (oui/non) "); //lumières
                choixLumiere = sc.next().toLowerCase();
                if (choixLumiere.matches(oui)) {
                    System.out.print("Quelle quantité de lumière ? (0/1/2/3+) ");
                    quantiteLumiere = sc.nextInt();
                    quantiteLumiere *= 3;
                    sc.nextLine();
                    System.out.print("Quel visuel ? (0=° / 1=*)");
                    choixVisuLum = sc.nextLine();
                    if (choixVisuLum.equals("0")) lumiere = "°";
                    else lumiere = "*";
                    System.out.print("Quel type de guirlande lumineuse ? (1=simple jaune, 2+=custom) ");
                    nbCouleursLumiere = sc.nextInt();
                    sc.nextLine();
                }
                couleursLumiere = new String[nbCouleursLumiere];

                    if (nbCouleursLumiere>1 && nbCouleursLumiere<=7) {
                        System.out.println("Quelles couleurs de lumières ? "); //choix des couleurs de lumière
                        for (int i=0; i < nbCouleursLumiere; i++){
                            couleurDemandee = sc.nextLine().toLowerCase();
                            if (!Arrays.asList(toutesCouleursLumiere).contains(couleurDemandee)){
                                i--;
                                System.out.println("Veuillez entrer une couleur valide (rouge/jaune/blanc/bleu/cyan/violet/vert)");
                            } else couleursLumiere[i] = couleurDemandee;
                        }   
                    }else couleursLumiere[0] = "jaune";

                
            }



            largeur = taille + taille/4 + 2;


            //dessus
            for (int i=0;i<taille/6+2;i++){
                for (int j=-largeur;j<=largeur;j++){
                    rand = rng.nextInt(100);

                    branche = " ";
                    if (rand<quantiteNeige) branche = Character.toString(neige); //neige
                    System.out.print(branche+reset);
                }
                System.out.println();
            }




            //POINTE DU SAPIN
            //détermination du cimier
            if(choixPointe.matches(oui)) {
                if(taille <= 5) pointe = jaune+"*";
                else if(5 < taille && taille <= 11) pointe = jaune+"x";
                else if(taille > 11) pointe = jaune+"X";
            } else pointe = vert+"^";
            //afichage de la première ligne
            for (int i = -largeur; i <= largeur; i++) {
                    rand = rng.nextInt(100);

                    branche = " ";
                    if (rand<quantiteNeige) branche = Character.toString(neige); //neige
                    if (i==0) branche = pointe; //cimier
                    System.out.print(branche+reset);
            }
            System.out.println();

            repetitionCouleurGuirlande += taille/9;
            inclinaisonGuirlande = rng.nextInt(6,16);
            if (rng.nextBoolean()) inclinaisonGuirlande *= -1;

            
            //BRANCHAGE
            for (int i = 1; i <= taille; i++) {
                if (choixGuirlande.matches(oui) && !ligneAGuirlande) seedCouleurGuirlande = rng.nextInt(couleursGuirlande.length*repetitionCouleurGuirlande);
                ligneAGuirlande = false;
                //if (choixGuirlande.matches(oui)) seedCouleurGuirlande = rng.nextInt(couleursGuirlande.length*repetitionCouleurGuirlande);
                for (int j = -largeur; j <= largeur; j++) {
                    rand = rng.nextInt(100);

                    branche = " ";
                    if (rand<quantiteNeige) branche = blanc + Character.toString(neige); //neige
                    if (Math.abs(j)<=i) {
                        if (rand<50) couleurBranche = vert;
                        else couleurBranche = vertGras;
                        if(j<0) branche = couleurBranche+"/"; //branches normales
                        else if(j>0) branche = couleurBranche+"\\";
                        
                        if (choixBoules.matches(oui) && rand<2*quantiteBoules &&  !avantBoule && nbCouleurs>0) { //boules
                            couleurBouleRandom = rng.nextInt(nbCouleurs);
                            couleurBoule = codesCouleurs.get(listeCouleursBoule[couleurBouleRandom]);//couleur aléatoire
                            if (rand<quantiteBoules) branche = couleurBoule+"O";
                            else if (rand<2*quantiteBoules) branche = couleurBoule+"o";
                            avantBoule = true;
                        } else avantBoule = false;

                        if ((choixLumiere.matches(oui)||choixLumiere.matches("2|3|4|5|6|7|8")) && rand>99-quantiteLumiere &&  !avantLumiere) { //lumières
                            couleurLumiereRandom = rng.nextInt(nbCouleursLumiere);
                            couleurLumiere = codesCouleurs.get(couleursLumiere[couleurLumiereRandom]+"Clignotant");//couleur aléatoire
                            branche = couleurLumiere+lumiere;
                            avantLumiere = true;
                        } else avantLumiere = false;

                        if ((i+(j+taille+9)/inclinaisonGuirlande)%(2+taille/6)==0 && choixGuirlande.matches(oui)){
                            numCouleurGuirlande = ((j+taille+seedCouleurGuirlande) % (repetitionCouleurGuirlande*couleursGuirlande.length)) / repetitionCouleurGuirlande;

                            numGuirlande = compteurGuirlande%typeGuirlande;
                            branche = codesCouleurs.get(couleursGuirlande[numCouleurGuirlande]+"Barre")+guirlande[numGuirlande];
                            ligneAGuirlande = true;
                        }


                    }
                    if (j==0 && (!choixGuirlande.matches(oui) || (i+(j+taille+9)/inclinaisonGuirlande)%(2+taille/6)!=0)) branche = vert+"|"; //tronc

                    System.out.print(branche+reset);
                    }
                System.out.println();
                if (i%(2+taille/6)==0 && choixGuirlande.matches(oui)) compteurGuirlande++;
            }
            
            
            //TRONC
            tronc = taille/4;
            tronc = tronc % 2 + tronc;

            if (taille<6) tronc--;

            for (int y = 0; y < taille/8+1; y++){
                for (int x = -largeur; x <= largeur; x++){
                    
                    if (Math.abs(x)<tronc/2+1) System.out.print(noir+"|"+reset);
                    else if (rng.nextInt(100)<(quantiteNeige/2)) System.out.print(blanc+neige+reset);
                    else System.out.print(" ");

                }
                System.out.println();

            }


            quantiteNeigeSol = quantiteNeige * (4-choixNeige)*(4-choixNeige)*choixNeige;
            quantiteNeigeSol = (int)Math.round(Math.sqrt(quantiteNeigeSol));

            //quelles couleurs pour le sol ?
            if (quantiteNeigeSol>0 && quantiteNeigeSol<=6) couleursSol = solNeige2;
            else if (quantiteNeigeSol>6 && quantiteNeigeSol<=9) couleursSol = solNeige3;
            else if (quantiteNeigeSol>9 && quantiteNeigeSol<=12) couleursSol = solNeige4;
            else if (quantiteNeigeSol>12 && quantiteNeigeSol<=15) couleursSol = solNeige5;
            else if (quantiteNeigeSol>15) couleursSol = solNeige6;
            else couleursSol = solNeige1;


            couleurSol ="\033[100;2;90;7m";

            //SOL
            for (int i=0;i<taille/11+1;i++){
                for (int j=-largeur;j<=largeur;j++){
                    rand = rng.nextInt(1,(taille/3)+2);

                    if (i==0) {
                        couleurSol = couleursSol[couleursSol.length-1];
                        for (int l=couleursSol.length; l>0; l--) {
                            if (Math.abs(j) +(rand- couleursSol.length) < taille-(taille/couleursSol.length)*(couleursSol.length-l-1)) couleurSol = couleursSol[l-1];
                        }

                    }
                    else couleurSol ="\033[100;2;90;7m";

                    System.out.print(couleurSol+"/"+reset);
                }
                System.out.println();
            }
            
            // System.out.println("X".repeat(taille/4+taille-(taille/4+1)/2)+"O".repeat(taille/4+5));
            // System.out.println("O".repeat(taille/4+2+2+rng.nextInt(taille/10))+"X".repeat((taille/4+taille-(taille/4+1)/2)-(taille/4+2+2+rng.nextInt(taille/10)))+"O".repeat(taille/4+3));



            String[][][] cadeaux = {{{" ","_","_","O","_","_"," "},{"|"," "," ","|"," "," ","|"},{"|","=","=","|","=","=","|"},{"|","_","_","|","_","_","|"}},{{" ","_","_","_","_","_","_","_","o","O","_","_","_","_","_","_","_"},{"|"," "," "," "," "," "," "," ","|","|"," "," "," "," "," "," "," ","|"},{"|","~","~","~","~","~","~","~","|","|","~","~","~","~","~","~","~","|"},{"|","_","_","_","_","_","_","_","|","|","_","_","_","_","_","_","_","|"}},{{" "," "," ","_","c","O","_"," "," "},{" "," ","|","_","_","_","_","|"," "},{"_","_","|","_","_","_","_","|","_"},{"|"," "," "," ","|"," "," "," ","|"},{"|"," "," "," ","|"," "," "," ","|"},{"|","_","_","_","|","_","_","_","|"}}};
            String[][][] encodageCouleurs  = {{{"0","1","1","2","1","1","0"},{"1","0","0","2","0","0","1"},{"1","2","2","2","2","2","1"},{"1","1","1","2","1","1","1"}},{{"0","1","1","1","1","1","1","1","2","2","1","1","1","1","1","1","1"},{"1","0","0","0","0","0","0","0","2","2","0","0","0","0","0","0","0","1"},{"1","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","1"},{"1","1","1","1","1","1","1","1","2","2","1","1","1","1","1","1","1","1"}},{{"0","0","0","1","3","3","1","0","0"},{"0","0","1","3","3","3","3","1","0"},{"2","2","1","2","2","2","2","1","2"},{"2","0","0","0","3","0","0","0","2"},{"2","0","0","0","3","0","0","0","2"},{"2","2","2","2","3","2","2","2","2"}}};;
            int[] nbCouleursCadeaux = {2,2,3};
            ArrayList<Integer> cadeauxBonneHauteur = new ArrayList<>();
            ArrayList<Integer> cadeauxBonneLargeur = new ArrayList<>();
            int largeurMax=0;
            String[][] TRONC; //le tableau à afficher
            ArrayList<String> couleursDuCadeau = new ArrayList<String>(); //liste des nom des couleurs pour le cadeau actuel
            boolean dejaLa; //pour éviter les répétitions de couleurs
            int espaceDispo; //cb de place pour le cadeau ?
            int xA; //point gauche du cadeau
            int xB; //limite droite possible du cadeau
            int decalageCadeau;
            int quelCadeau;

            TRONC = new String[taille/8+1][largeur*2+1];
            for (String[] lignes : TRONC) Arrays.fill(lignes, " ");

            decalageCadeau = rng.nextInt(1,taille/12+2);
            xA = taille/4 + 2 + decalageCadeau;
            xB = taille + taille/4 - (taille/4+1)/2;
            espaceDispo = xB-xA;

            //filtrage des cadeaux en fonction de leurs hauteurs
            for (int i=0; i<cadeaux.length; i++) {
                if (cadeaux[i].length<taille/8+1) cadeauxBonneHauteur.add(i);
            }


            System.out.println(cadeauxBonneHauteur);/////


            while (espaceDispo>5) {
                decalageCadeau = rng.nextInt(1,taille/12+2);
                cadeauxBonneLargeur.clear();

                //filtrage des cadeaux en fonction de leurs largeurs
                for (int jsp : cadeauxBonneHauteur){
                    largeurMax = 0;
                    for (int i=0; i<cadeaux[jsp].length;i++){
                        if (cadeaux[jsp][i].length>largeurMax) largeurMax = cadeaux[jsp][i].length;
                    }
                    if (largeurMax<=espaceDispo) cadeauxBonneLargeur.add(jsp);
                }

                quelCadeau = rng.nextInt(cadeauxBonneLargeur.size());

                for (int y=0; y<cadeaux[cadeauxBonneLargeur.get(quelCadeau)].length; y++) {
                    for (int x=0; x<cadeaux[cadeauxBonneLargeur.get(quelCadeau)][y].length; x++) {
                        TRONC[taille/8+1-cadeaux[cadeauxBonneLargeur.get(quelCadeau)].length+y][xA+x] = cadeaux[cadeauxBonneLargeur.get(quelCadeau)][y][x];

                    }
                }
                xA += cadeaux[cadeauxBonneLargeur.get(quelCadeau)][1].length + decalageCadeau;
                espaceDispo = xB - xA;

                cadeauxBonneHauteur.remove(quelCadeau);

            }

            for (String[] ligne : TRONC){
                for (String car : ligne){
                    System.out.print(car);
                }
                System.out.println();
            }






            for (int y=0;y<TRONC.length;y++){
                for (int x=0; x<TRONC[y].length;x++){
                    if (x>xA && x<xB) System.out.print("O");
                    else System.out.print("X");
                }
                System.out.println();
            }








            sc.close();
}}