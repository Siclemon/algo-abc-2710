import java.util.ArrayList;

public class AppPoint {
    static ArrayList<Point> listePoints = new ArrayList<>();
    public static void main(String[] args) {
        Point point = new Point(10, 3);

        point.position();
        
        point.deplacer(-2, 4);

        point.position();

        point.permutation();

        point.position();

        Point point2 = point.symOrd();

        point2.position();

        Point point3 = point.symAbs();

        point3.position();

        Point point4 = point.symOrigine();

        point4.position();

        Point point5 = new Point();

        point5.position();

        Point point6 = point.symAbs().symOrd();

        point6.position();

        listePoints.add(point);
        listePoints.add(point2);
        listePoints.add(point3);
        listePoints.add(point4);
        //graphique();
    }


    public static void graphique() {
        System.out.print("\033\143" + "\033[48;2;255;255;255m\033[38;2;0;0;0m");
        int[] coord = coordonneesMax();
        int xMin = coord[0];
        int xMax = coord[1];
        int yMin = coord[2];
        int yMax = coord[3];

        for (int y=yMin; y<=yMax; y++) {
            for (int x=xMin; x<=xMax; x++) {
                if (x!=0 && y/2!=0) System.out.print("\033["+(y/2+yMax)+";"+(x-xMin)+"H" + " ");
                if (x==0)
                    System.out.print("\033["+(y/2+yMax)+";"+(x-xMin)+"H" + "█");
                else if (y/2==0)
                    System.out.print("\033["+(y/2+yMax)+";"+(x-xMin)+"H" + hautOuBas(y));
            }
        }
        
        for (Point pt : listePoints) {
            System.out.print("\033["+(yMax-pt.getY()/2)+";"+(pt.getX()-xMin)+"H" + hautOuBas(pt.getY()));
        }
        
        System.out.print("\33[15;1H" + "\033[m");
    }

    public static int[] coordonneesMax() {
        int[] ret = {-5,5,-5,5};

        for (Point pt : listePoints) {
            if (pt.getX()<ret[0])
                ret[0] = pt.getX();
            if (pt.getX()>ret[1])
                ret[0] = pt.getX();
            if (pt.getY()<ret[2])
                ret[0] = pt.getY();
            if (pt.getY()>ret[3])
                ret[0] = pt.getY();
        }

        for (int i = 0; i < ret.length; i++) {
            ret[i] += ret[i];
        }
        
        return ret;
    }

    public static String hautOuBas(int y) {
        if (y%2==0)
            return "▀";
        else
            return "▄";
    }
}
