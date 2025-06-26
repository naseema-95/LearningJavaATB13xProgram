package ex_14_Functions;

import java.util.Scanner;

public class Lab105_UDF {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");

        if(scanner.hasNextInt()){
             a = scanner.nextInt();
        }else{
            System.out.println("Please enter valid value");
            System.exit(0);
        }


        System.out.println("Enter the second number");
        if(scanner.hasNextInt()){
             b = scanner.nextInt();
        }else{
            System.out.println("Please enter valid value");
            System.exit(0);
        }

        int sum = add(a,b);
        int diff = sub(a,b);
        int prod = mul(a,b);
        int divi = divid(a,b);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(divi);

    }
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int divid(int a, int b){
        if(b == 0){
            System.out.println("Please enter a non zero value");
            System.exit(1);
        }
        return a/b;
    }
}
