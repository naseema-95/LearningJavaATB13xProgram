package ex_21_Polymorphism;

public class Lab_124_Calculator {
    public static void main(String[] args) {

        calC c1 = new calC();
        int a1= c1.add(2,3);
        double d1 = c1.add(9.01,10.98);

        System.out.println(a1);
        System.out.println(d1);

    }
}

class calC{

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}
