package ex_04_Java_operators;

public class Lab029_concatenate_1 {
    public static void main(String[] args) {
        String first_name="Hello ";
        String last_name="World";

        int a =10;
        int b = 20;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));
    }
}
