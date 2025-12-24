
package exercices;
import java.util.Scanner;
public class exerciceEmprunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tauxInteretAnnuel, nbrAnneeRbmt, capitalEmprunte, tauxInteretmensuel, mensualite, mois, interetsMensuel, amortissementMois;
        double q;

        System.out.println("taux annuel");
        tauxInteretAnnuel = sc .nextDouble();
        System.out.println("nbr années");
        nbrAnneeRbmt = sc .nextDouble();
        System.out.println("montant");
        capitalEmprunte = sc .nextDouble();


        mois=nbrAnneeRbmt*12;
        tauxInteretmensuel = tauxInteretAnnuel/12;
        q = (1-Math.pow((1+tauxInteretmensuel),-mois));

        mensualite = capitalEmprunte * tauxInteretmensuel/q;


        mensualite = Math.round(mensualite*100.0)/100.0;
        System.out.println(mensualite);
    }
}
