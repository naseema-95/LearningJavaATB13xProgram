package ex_06_ternary_operators;

public class Lab046_threenummax {
    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        int c = 9;

        int result = ( a > b ) && ( a > c ) ? a : ( b > c) ? b :c;
        System.out.println(result);
    }
}
