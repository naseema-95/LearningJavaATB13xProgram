package ex_26_Abstraction_Interface;

public class Lab_158_Interface {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getArea(10,20);

        Square s1 = new Square();
        s1.getArea(23,5);
    }
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int a,int b){
        System.out.println("Area of a rectangle "+ a*b);
    }
}

class Square implements Polygon{

    @Override
    public void getArea(int a, int b){
        System.out.println("Area of Square :"+ a*b);
    }
}

interface Polygon{

    void getArea(int a, int b);

    default void complete(){
        System.out.println("this is a complete method in interface using default keyword");
    }

    static void staticComplete(){
        System.out.println("this is a complete method in interface using static keyword");
    }
}