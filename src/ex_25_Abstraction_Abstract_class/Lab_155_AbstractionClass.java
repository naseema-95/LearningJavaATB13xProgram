package ex_25_Abstraction_Abstract_class;

public class Lab_155_AbstractionClass {
    public static void main(String[] args) {

        child c1 = new child();
        c1.loan50k();
        c1.loan25K();
    }

}

abstract class Father{

    //this is abstract method
    abstract void loan50k();

    //this is a complete method
    void loan25K(){
        System.out.println("Pay 25K loan");
    }
}

class child extends Father{

    @Override
    void loan50k(){
        System.out.println("Child pays 50 k loan");
    }
}
