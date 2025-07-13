package ex_25_Abstraction_Abstract_class;

public class Lab_156_Cars {
    public static void main(String[] args) {
        car WagonR = new car();
        WagonR.startEngine();
        WagonR.checkEngine();
        WagonR.stopEngine();

        //Engine e1 = new Engine();// this erros as abstract class cannot be instantiated.
    }
}

abstract class Engine{

    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine(){
        System.out.println("All Good");
    }
}

class car extends Engine{
    @Override
    void startEngine(){
        System.out.println("Engine Started");
    }

    @Override
    void stopEngine(){
        System.out.println("Engine Stopping");
    }

}