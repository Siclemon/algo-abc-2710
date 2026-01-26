import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppCompte {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"Voir les informations","Créditer","Débiter","Transférer vers un autre compte","Comparer à un autre compte","Nouveau compte","Changer de compte","Quitter"};
        options = menuCreator(options, false);
        boolean stop = false;
        List<Compte> liste = new ArrayList<>();
        Compte temp;
        
        Compte compte = nouveauCompte();
        liste.add(compte);


        while (!stop) {
            //System.out.print("\033\143");
            System.out.print("\n\n\033[4;1;48;2;0;0;80mQue voulez-vous faire ?\033[m\n\n");
            
            for (String string : options) {
                System.out.println(string);
            }

            System.out.print("\n  > ");
            char input = sc.nextLine().charAt(0);
            switch (input) {
                case 'v':
                    System.out.print("\n\033[38;2;0;200;255m"+compte+"\033[m");
                    break;
                case 'c':
                    System.out.print("\n\nCombien voulez-vous ajouter ?\n> ");
                    compte.crediter(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 'd':
                    System.out.print("\n\nCombien voulez-vous retirer ?\n> ");
                    compte.debiter(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 'q':
                    stop = true;;
                    break;
                case 'n':
                    liste.add(nouveauCompte());
                    break;
                case 'h':
                    compte = choixCompte(liste);
                    break;
                case 't':
                    temp = choixCompte(liste);
                    System.out.print("Montant à transférer : ");
                    compte.transferer(temp, sc.nextDouble());
                    sc.nextLine();
                    break;
                case 'o':
                    comparaison(compte, liste);
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n\033[38;2;230;230;0mAu revoir !\033[m\n");
        sc.close();
    }

    public static void comparaison(Compte compte, List<Compte> liste) {
        Compte temp = choixCompte(liste);

        System.out.println();
        switch (compte.comparer(temp)) {
            case 1:
                System.out.print(compte.getNom() + " a plus d'argent que " + temp.getNom() + ".");
                break;
            case -1:
                System.out.print(temp.getNom() + " a plus d'argent que " + compte.getNom() + ".");
                break;
            case 0:
                System.out.print(compte.getNom() + " et " + temp.getNom() + " ont autant d'argent sur leurs comptes.");
                break;
        }
    }

    public static Compte nouveauCompte() { 

        System.out.print("\033\143");
        System.out.print("\033[4;1;48;2;0;0;80mCréation de compte :\033[m\n\n");
        System.out.print("Titulaire du compte : ");
        String nom = sc.nextLine();
        System.out.print("Solde initial : ");
        double solde = sc.nextDouble();
        sc.nextLine();

        return new Compte(nom, solde);
    }

    public static Compte choixCompte(List<Compte> liste) {
        Compte ret;

        System.out.println("\nVeuillez choisir un compte");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println("("+(i+1)+") - " + liste.get(i).getNom());
        }

        ret = liste.get(sc.nextInt()-1);
        sc.nextLine();

        return ret;
    }

    public static String[] menuCreator(String[] options, boolean majuscules) {
        char[] lettresUtilisees = new char[options.length];

        for (int i=0; i<options.length; i++) {

            if (majuscules) options[i] = options[i].toUpperCase();

            for (int j=0; j<options[i].length(); j++) {
                boolean presente = false;
                for (int k=0; k<lettresUtilisees.length; k++) {
                    if (lettresUtilisees[k] == options[i].charAt(j)) presente = true;  
                }

                if (!presente) {
                    lettresUtilisees[i] = options[i].charAt(j);
                    options[i] = options[i].substring(0,j) + "\033[1;4m" + lettresUtilisees[i] + "\033[22;24m" + options[i].substring(j+1);

                    break;
                }
            }
        }
        return options;
    }
}
