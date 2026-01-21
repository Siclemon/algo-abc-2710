package intro;
import java.util.Scanner;
public class trancheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        System.out.println("Quel âge avez-vous ?");
        age = scan.nextInt();

        if (age<=2) System.out.print("Vous êtes un bébé");
        else if (age<=8) System.out.println("Vous êtes un enfant");
        else if (age<=13) System.out.println("Vous êtes un pré-ados");
        else if (age<=21) System.out.println("Vous êtes un Adolescents");
        else if (age<=25) System.out.println("Vous êtes un jeune Adulte");
        else if (age<=40) System.out.println("Vous êtes un adulte");
        else if (age<=60) System.out.println("Vous êtes un adulte mûr");
        else if (age>60) System.out.println("Vous êtes un senior");
        else System.out.println("Age inconnu");

        // switch (age) {
        //     case :
                
        //         break;
        
        //     default:
        //         break;
        // }

        scan.close();
    }
}