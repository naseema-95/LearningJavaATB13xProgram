package ex_20_Inheritance.Single_Inheritance;

public class Lab116_UseCase {
    public static void main(String[] args) {

        TestCase1 t1 = new TestCase1();
        t1.running();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();


        Common_toAll ca = new Common_toAll();
        TestCase1 t3 = new TestCase1();
        Common_toAll ca1 = new TestCase1(); //Dynamic Distpatch

       // TestCase1 t5 = new Common_toAll();not possible
    }
}
