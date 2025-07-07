package ex_20_Inheritance.Multilevel;

public class Lab117_useCase {
    public static void main(String[] args) {
        GrandFather g1 = new GrandFather();
        g1.gf();

        father f1 = new father();
        f1.f();
        f1.gf();

        Son s1 = new Son();
        s1.gf();
        s1.home(); //Son's home method will be called, if sons class doesnt have home method then fathers home will be called.

            }
}
