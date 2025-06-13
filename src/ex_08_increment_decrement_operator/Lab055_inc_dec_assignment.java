package ex_08_increment_decrement_operator;

public class Lab055_inc_dec_assignment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);// a++ = 10 ; a= 11

        int b = 10;
        System.out.println(b++ + ++b);// b++ = 10; ++b = 10+1=11 +1 =12
        System.out.println(b); // 12

        int c = 10;
        System.out.println(++c + ++c); // ++c 11; ++c= 12
        System.out.println(c); // 12
    }
}
