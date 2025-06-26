package ex_14_Functions;

public class Lab103_UDF3 {
    public static void main(String[] args) {
        f1();
        String msg = f2();
        System.out.println(msg);
        f3("Naseema",30);
        int res = f4(8,10);
        System.out.println(res);

    }
    //Without Parameters and without return type
    static void f1(){
        System.out.println("Without Parameters and without return type");
        System.out.println("Hello");
    }
    //Without Parameters and with return type
    static String f2(){
        return "Without Parameters and with return type";
    }
    //With Parameters and without return type
    static void f3(String name, int age){
        System.out.println("With Parameters and without return type");
        System.out.println("Name: "+ name+ " Age: "+age);
    }

    //With Parameters and with return type
    static int f4(int a, int b){
        System.out.println("With Parameters and with return type");
        return a+b;// return type can both primitive and non primitive datatypes
    }
}
