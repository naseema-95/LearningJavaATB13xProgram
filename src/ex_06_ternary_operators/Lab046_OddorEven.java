package ex_06_ternary_operators;

public class Lab046_OddorEven {
    public static void main(String[] args) {

        int a = 19;
        String num = (a % 2 ==0) ? "Even" : "Odd";
        System.out.println(num);

        int a1 = 20;
        String num1 = (a1 % 2 == 0) ? "Even" : "Odd";
        System.out.println(num1);
    }
}
