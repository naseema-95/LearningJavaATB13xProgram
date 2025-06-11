package ex_04_Java_operators;

public class Lab027_Logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(!a);
        System.out.println(!!b);

        boolean c = a || b;
        System.out.println(c);

        boolean d = a && b;
        System.out.println(d);
    }
}
