package ex_09_if_condition;

public class Lab052_triangle_classifier {
    public static void main (String[] args) {

        int a = 10;
        int b = 20;
        int c = 20;

        if ( a == b || a == c || b == c) {
            System.out.println("two sides are equal, triangle is isosceles triangle");
            }
        else if (a != b || b != c || a != c) {
            System.out.println("no sides are equal,scalene traiangle");
            }
        else {
            System.out.println("equilateral triangle");
        }
    }
}
