package ex_04_Java_operators;

public class Lab025_unary_operator {
    public static void main(String[] args) {
        int a=+10;// writing + is optional
        int a1=-100;

        int result;

        result=a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);

        int b=-1;
        b= b+1;
        System.out.println(b);
    }
}
