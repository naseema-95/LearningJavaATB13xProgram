package ex_07_user_inputs;

import java.util.Scanner;

public class Lab051_UserScanner2 {
    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner string_scanner = new Scanner(System.in);
        System.out.println(string_scanner.next());

        System.out.println("Enter the float number");
        Scanner float_scanner = new Scanner(System.in);
        System.out.println(float_scanner.nextFloat());

        System.out.println("Enter the double");
        Scanner double_scanner = new Scanner(System.in);
        System.out.println(double_scanner.nextDouble());

        System.out.println("Enter the Byte");
        Scanner byte_scanner = new Scanner(System.in);
        System.out.println(byte_scanner.nextByte());



    }
}
