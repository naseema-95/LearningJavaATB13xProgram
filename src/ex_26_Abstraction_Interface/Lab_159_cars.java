package ex_26_Abstraction_Interface;

public class Lab_159_cars {
    public static void main(String[] args) {

        car c1 = new car();
        c1.drive();
    }
}

class car implements Brakes,Engine{

    void drive(){
        applyBrake();
        startEngine();
        stopEngine();
    }

    @Override
    public void applyBrake(){
        System.out.println("Apply Brakes");
    }

    @Override
    public void startEngine(){
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stopping Engine");
    }
}

interface Brakes{
    void applyBrake();
}

interface Engine{
    void startEngine();
    void stopEngine();
}