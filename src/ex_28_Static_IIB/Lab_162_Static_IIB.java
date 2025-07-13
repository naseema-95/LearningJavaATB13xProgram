package ex_28_Static_IIB;

public class Lab_162_Static_IIB {

    public static void main(String[] args) {

        P p1 = new P();
        P p2 = new P();
        System.out.println(P.a);
        P.a = 13;
        System.out.println(P.a);
        System.out.println(p1.a);
        p1.b = 12;
        p2.b = 15;
        System.out.println(p1.b);
        System.out.println(p2.b);

    }

}

class P{
    static int a = 10;
    int b = 23;

    static{
        //This is a static block, gets loaded whenever a class is loaded
        System.out.println("Hi, this is called because the class is loaded");
    }
}
