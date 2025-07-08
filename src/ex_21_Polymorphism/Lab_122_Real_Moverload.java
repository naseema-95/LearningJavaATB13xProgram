package ex_21_Polymorphism;

public class Lab_122_Real_Moverload {
    public static void main(String[] args) {

        home h1 = new home();
        h1.task();
        System.out.println(h1.task(2));
        System.out.println(h1.task(true));

    }
}

class home{
    void task(){
        System.out.println("Task1");
    }

    int task(int a){
        return a;
    }

    boolean task(boolean a){
        return false;
    }
}
