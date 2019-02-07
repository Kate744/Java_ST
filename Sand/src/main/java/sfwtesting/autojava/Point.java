package sfwtesting.autojava;

public class Point {

    public int x;
    public int y;


    public Point(int absisa, int ordinata) {
        this.x = absisa;
        this.y = ordinata;
    }
// До
   /* public double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    };*/
// После:
    public double distance(Point p2) {
        return Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
    }

};


