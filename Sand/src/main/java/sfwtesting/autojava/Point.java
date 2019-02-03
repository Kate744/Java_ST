package sfwtesting.autojava;

public class Point {

    public int a1;
    public int a2;
    public int b1;
    public int b2;

    public Point(int a1, int a2, int b1, int b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }

    public Point1(int a1, int a2) {

    }
    public Point2(int b1, int b2) {

    }

    public double distance(Point1, Point2) {
        return Math.sqrt((this.b2 - this.b1) * (this.b2 - this.b1) + (this.a2 - this.a1) * (this.a2 - this.a1));
    }
}
