package ex_08_increment_decrement_operator;

public class task_program {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a: " + a);

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);

        int i = 1;

        i = i++ + ++i;

        System.out.println(i);

        int x = 5;

        System.out.println(x++ + ++x);

        int y = 5;

        System.out.println(++y); // Output: ?

        System.out.println(y++); // Output: ?

        System.out.println(y);

        int c = 5;

        int d = c++ + ++c;

        System.out.println("c: " + c); // Output: ?

        System.out.println("d: " + d); // Output: ?

        int j = 5;

        int k = j++ + ++j + j++ + ++j;

        System.out.println("j = " + j + ", k = " + k);


    }
}
