package ex_04_Java_operators;

public class Lab037_test {
    public static void main(String[] args) {
        int a = 10;
        boolean b = (10 == 11); // == -> Comparison 2 values
        System.out.println(a);
        System.out.println(b);

        long l = 10l; // 8 Byte, 64 Bits
        String s3 = "name"; //  8 Byte, 64 Bits

        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1);

        System.out.println('A' == 65);

        short s = 10;
        char c = 'A';
        String s1 = "A";
        System.out.println(c+s); // 10+65
        System.out.println(c); // A
        System.out.println(c+c);//130
        System.out.println(c+s1); // concatenation
    }
}
