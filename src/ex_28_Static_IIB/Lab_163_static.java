package ex_28_Static_IIB;

public class Lab_163_static {
    public static void main(String[] args) {

        A ref1 = new A(10);
        A ref2 = new A(11);

        System.out.println(ref1.a);
        System.out.println(ref2.a);
        System.out.println(A.b);

        ref1.displayValue();
        ref2.displayValue();

        A.staticMethod();
    }
}

class A{
    int a;//instance or non static variable
    static int b = 20;

    A(int a){
        this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
        System.out.println(b);
    }
    
    static void staticMethod(){
        System.out.println("I will be called when the class is loaded");
    }
}
