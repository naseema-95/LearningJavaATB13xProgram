package ex_21_Polymorphism;

public class Lab125_MethodOverriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();


    }
}

class Animal{

    void sound(){
        System.out.println("default sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}