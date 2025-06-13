package ex_08_increment_decrement_operator;

import java.util.Scanner;

public class Lab053_decrement_operator {
    public static void main (String[] args) {

        System.out.println("Enter the value");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println("the value of b is: " + b);

        --b;
        System.out.println(b);// first decreases the value and then stores it prints  6

        System.out.println(b--);// first stores the value and then decreases it //exp 6
        System.out.println(b); // finally stores the value //5
    }
}
