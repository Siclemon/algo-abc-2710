public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void position() {
        System.out.println("X : "+x+"  \tY : "+y);
    }

    public void deplacer(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void permutation() {
        double temp = x;
        x = y;
        y = temp;
    }

    public Point symOrd() {
        return new Point(-x, y);
    }

    public Point symAbs() {
        return new Point(x, -y);
    }

    public Point symOrigine() {
        return new Point(-x, -y);
    }
    
    public double distance(Point autrePoint) {
        return Math.sqrt(Math.pow(x-autrePoint.getX(),2)+Math.pow(y-autrePoint.getY(), 2));
    }
}
