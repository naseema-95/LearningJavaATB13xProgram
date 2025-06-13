package ex_09_if_condition;

import java.util.Scanner;

public class Lab057_Goacheck {
    public static void main(String[] args) {

        System.out.println("Please enter the age");
        Scanner scan = new Scanner(System.in);
        int age= scan.nextInt();

        System.out.println("Age entered :" + age);

        if (age >= 18) {
            System.out.println("Can visit Goa");
        }
        else{
            System.out.println("Cannot visit Goa");
        }
    }
}
