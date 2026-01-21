public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void position() {
        System.out.println("X : "+x+"\tY : "+y);
    }

    public void deplacer(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void permutation() {
        int temp = x;
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
}
