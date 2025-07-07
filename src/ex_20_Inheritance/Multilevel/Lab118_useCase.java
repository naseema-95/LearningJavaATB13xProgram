package ex_20_Inheritance.Multilevel;

public class Lab118_useCase {
    public static void main(String[] args) {
        Son amit = new Son();

       // Son s1 = new father();
        //Son s2 = new GrandFather();

        GrandFather g5 = new Son();// Dynamic Dispatch
        //g5.s();  only methods with common name
        System.out.println("Grand father to son");
        g5.home();

        father f5 = new Son();
        System.out.println("father to son");
        f5.home();

        GrandFather g6 = new father();
        System.out.println("grandfather to father");
        g6.home();

    }
}
