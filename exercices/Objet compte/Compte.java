import java.util.Date;

public class Compte {
    private final long numero;
    private final String nom;
    private double solde;
    private final double decouvertAutorise;

    public Compte(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
        numero = genererNumero();
        decouvertAutorise = -500;
    }

    public long getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    private long genererNumero() {
        Date date = new Date();
        return date.getTime(); 
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public void debiter(double montant) {
        if (soldeSuffisant(montant))
            solde -= montant;
        else
            System.out.print("\033[38;2;255;0;0mSolde insuffisant\033[m");
    }

    public void transferer(Compte autreCompte, double montant) {
        if (soldeSuffisant(montant)) {
            autreCompte.crediter(montant);
            solde -= montant;
        }
    }

    public boolean comparerBooleen(Compte autreCompte) {
        return solde>=autreCompte.getSolde();
    }

    public int comparer(Compte autreCompte) {
        double soldeux = autreCompte.getSolde();

        if (solde>soldeux) return 1;
        else if (solde<soldeux) return -1;
        else return 0;
    }

    private boolean soldeSuffisant(double montant) {
        return solde-montant>=decouvertAutorise;
    }

    public String toString() {
        return "\033[1;4mInformations du compte :\033[22;24m" + "\nNuméro de compte : "+ numero + "\nTitulaire : " + nom + "\nSolde : " + solde + "\nDécouvert autorisé : " + decouvertAutorise;
    }
}
