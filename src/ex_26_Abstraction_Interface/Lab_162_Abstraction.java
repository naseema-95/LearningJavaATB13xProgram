package ex_26_Abstraction_Interface;

public class Lab_162_Abstraction {
    public static void main(String[] args) {


    }
}

abstract class incompleteClass{
    int a =10;

    abstract void display();
    void display2(){
        System.out.println("print complete method in abstract class");
    }
}

interface incompleteInterface{
    int a =10; //final

    void display1();

    default void display2(){
        System.out.println("Interface default display 2");
    }

    static void display3(){
        System.out.println("Interface static display 3");
    }
}