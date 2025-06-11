package ex_04_Java_operators;

public class Lab036_All_operators {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        /*
            Arithematic Operators:
            +,-,/,*,%

            Relational Operators:
            >,<, >=, <=, ==, !=, ==

            Logical Operators
            ||, &&

            Bitwise Operators
            ~ bitwise not
            >> right shift
            << left shift
            ^ xor

            Compound operator
            +=, -=, /=, *=

            ternary operator
            ?:

            ++,-- increment, decrement
         */
        int age=10;
        age -=10;
        System.out.println(age);

        age +=10;
        System.out.println(age);
    }
}
