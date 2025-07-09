package ex_31_Exceptions;

import java.util.Scanner;

public class Lab_142_FInally_Purpose {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        try{
            int b = 10/a;
            System.out.println(b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
            System.out.println("Ending the program, closing the scanner");
        }

    }
}
