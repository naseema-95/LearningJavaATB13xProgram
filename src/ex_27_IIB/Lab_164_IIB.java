package ex_27_IIB;

public class Lab_164_IIB {
    public static void main(String[] args) {

        A a1 = new A();//static block gets called when the class is loaded i.e, only once
        A a2 = new A();
        //IIB- Interface Initialization Block
        //IIB gets called the number of times depending on the number of objects created
    }

}

class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("This is IIB 1");
        System.out.println("Gets called when the object is created");
    }
    {
        System.out.println("This is IIB 2");
    }
    static{
        System.out.println("Static block, called when the class is loaded");
    }
}
