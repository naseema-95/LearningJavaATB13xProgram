package ex_16_Task;

import java.util.Scanner;

public class Tsk_002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        if( num % 2 == 0 )
        {
            System.out.println("The give number "+num+" is even");
        } else {
            System.out.println("The give number "+num+" is odd");
        }
    }
}
