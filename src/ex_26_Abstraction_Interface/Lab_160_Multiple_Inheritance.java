package ex_26_Abstraction_Interface;

public class Lab_160_Multiple_Inheritance {
    public static void main(String[] args) {

        child c2 = new child();
        c2.money();
    }
}

class child implements Father1,Father2{

    @Override
    public void money(){
        System.out.println("Child pays the money");
    }
}

interface Father1{
    void money();
}

interface Father2{
    void money();
}