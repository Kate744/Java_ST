package sfwtesting.autojava;

public class WT {

public static void main (String[] args) {
    hello("man");


    double al = 5;
    System.out.println("Square if side a = " + al + " equal " + area(al));

    double a = 5;
    double b = 7;
    System.out.println("Square of rectangle if side a" + " = " + a + " and side b = " + b + " equal " + area(a,b));
}
public static void hello(String smb) {
    System.out.println("Hi " + smb + "!");
}

public static double area(double l) {
    return l * l;
}

public static double area (double a, double b) {
    return a * b;
}
};
