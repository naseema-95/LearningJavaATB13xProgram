package ex_31_Exceptions;
import java.util.Scanner;

public class Lab_150Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a1 = sc.nextInt();
        try {
            validateAge(a1);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
    static void validateAge(int age) throws ArithmeticException{
        if(age < 18){
            throw new ArithmeticException("Age is below 18");
        }
    }
}
