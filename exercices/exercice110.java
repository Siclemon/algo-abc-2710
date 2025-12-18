package exercices;

public class exercice110 {
    public static void main(String[] args) {
        int parfaits=0;
        int nombre=0;
        int somme;
        int n=4;
        int[] liste;

        liste = new int[n];

        while (parfaits<n) {

            nombre++;
            somme = 0;

            //somme des diviseurs
            for (int i=1; i<nombre; i++) {
                if (nombre%i==0) somme += i;
            }

            //parfait ?
            if (somme==nombre) {
                liste[parfaits] = nombre;
                parfaits++;
            }
        }
        System.out.println();
        for (int i=0; i<n; i++)
            System.out.println("\033[34m"+liste[i]+ "\033[0m est un nombre parfait.");
        System.out.println();

    }
    
}
