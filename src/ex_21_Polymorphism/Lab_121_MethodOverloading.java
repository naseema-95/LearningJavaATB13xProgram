package ex_21_Polymorphism;

public class Lab_121_MethodOverloading {
    public static void main(String[] args) {

        MathOperations mo1 = new MathOperations();
        int r1=mo1.add(3,4);
        int r2=mo1.add(3,4,5);
        double r3=mo1.add(3.2,4.5);
        String r4=mo1.add("Naseema","Banu");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}

class MathOperations{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b,int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }
}
