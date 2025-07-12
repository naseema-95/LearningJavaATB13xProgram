package ex_24_Super_Keyword;

public class Lab_154_Super {
    public static void main(String[] args) {
        Animal cat = new Animal(10,20);
        cat.sound();
    }
}

class God{
    public int gold = 100;
    void sound(){
        System.out.println("God !!");
    }
    God(){
        System.out.println("God DC");
    }
}

class Animal extends God{
    @Override
    void sound(){
        super.sound();
        System.out.println("sound methd");
    }

    Animal(){
        super();

    }

    Animal(int a, int b){

        System.out.println(a+b);
    }

    void test(){
        System.out.println(super.gold);
    }
}
