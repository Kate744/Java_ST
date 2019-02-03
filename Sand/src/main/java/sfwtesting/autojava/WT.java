package sfwtesting.autojava;

public class WT {

public static void main (String[] args) {
    hello("man");

    Square s = new Square(5);
    System.out.println("Square if side a = " + s.l + " equal " + s.areal());

    Rectangle r = new Rectangle(5,7);
    System.out.println("Square of rectangle if side a" + " = " + r.a + " and side b = " + r.b + " equal " + r.area());

    Point p = new Point(18, 27, 14, 10);
    System.out.println("Distance between two points is " + p.distance());

}
public static void hello(String smb) {
    System.out.println("Hi " + smb + "!");
}

};
