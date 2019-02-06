package sfwtesting.autojava;

public class WT {

public static void main (String[] args) {
    hello("man");

    Square s = new Square(5);
    System.out.println("Square if side a = " + s.l + " equal " + s.areal());

    Rectangle r = new Rectangle(5, 7);
    System.out.println("Square of rectangle if side a" + " = " + r.a + " and side b = " + r.b + " equal " + r.area());

    // Домашнее задание 2
    Point p1 = new Point(3, 5);
    Point p2 = new Point(8, 1);

   //Было: System.out.println("Distance between two points is " + p1.distance(p1, p2));
    // Стало:
    System.out.println("Distance between two points is " + p1.distance(p2));
}

    public static void hello(String smb) {
        System.out.println("Hi " + smb + "!");
    }

};
