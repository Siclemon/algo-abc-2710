package intro;

public class x {
    
    public static void main(String[] args) {



        for (int i = -2; i <= 2; i++) {
            System.out.println(" ".repeat(2-Math.abs(i))+"*"+" ".repeat(Math.abs(2*Math.abs(i)-1)) + ((i==0) ? ("") :("*")));




        }

    }
}
