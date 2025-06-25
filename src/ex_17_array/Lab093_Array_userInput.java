package ex_17_array;

import java.util.Scanner;

public class Lab093_Array_userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sie of the array");
        int size = scanner.nextInt();

        int[] i_a = new int[size];


        for(int i = 0; i < i_a.length; i++)
        {
            System.out.println("Enter the array elements");
           i_a[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");

        for(int j = 0; j < i_a.length; j++)
        {
            System.out.println(i_a[j]);
        }
    }
}
