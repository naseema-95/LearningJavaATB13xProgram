package ex_08_increment_decrement_operator;

public class Lab054_inc_dec {
    public static void main(String[] args) {

        System.out.println("A Parameter");
        int a = 10;
        int result = ++a;

        System.out.println(a);
        System.out.println(result);

        System.out.println("B Parameter");
        int b =10;
        int result1 = b++;

        System.out.println(b); // this will have the actual incremented value
        System.out.println(result1); // this will have the value of expression i.e, 10
    }
}
