package ex_07_user_inputs;

import java.util.Scanner;

public class Lab050_UserScanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        String canVote = (age >= 18) ? "Yes" : "No";
        System.out.println("Can the user vote: "+ canVote+ " Vote age: "+age);

    }
}
