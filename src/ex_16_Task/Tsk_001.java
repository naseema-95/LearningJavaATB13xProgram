package ex_16_Task;

import java.util.Scanner;

public class Tsk_001 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = scanner.nextInt();

        if(i > 0){
            System.out.println("The give number "+i+" is positive");
        } else {
            System.out.println("The give number "+i+" is negative");
        }
    }
}
