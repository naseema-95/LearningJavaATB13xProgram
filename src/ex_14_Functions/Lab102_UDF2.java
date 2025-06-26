package ex_14_Functions;

public class Lab102_UDF2 {
    public static void main(String[] args) {

        int result = add(3,4);
        System.out.println(result);
        add1(4,5);

    }
    static int add(int a , int b){
        return a+b; // with return
    }
    static void add1(int a , int b){
        System.out.println(a+b); //no return type
    }
}
