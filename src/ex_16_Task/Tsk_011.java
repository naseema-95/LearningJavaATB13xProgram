package ex_16_Task;

import java.util.Scanner;

public class Tsk_011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

        if(marks < 0 || marks > 100){
            System.out.println("Enter valid marks");
            System.exit(0);
        }

        if( marks >= 90 && marks <=100){
            System.out.println("A+");
        } else if(marks >= 80 && marks < 90) {
            System.out.println("A");
        } else if(marks >= 70 && marks < 80){
            System.out.println("B");
        } else if(marks >= 60 && marks < 70){
            System.out.println("C");
        } else if(marks >= 50 && marks < 60){
            System.out.println("D");
        }else if(marks >= 40 && marks < 50){
            System.out.println("E");
        }else if(marks < 40){
            System.out.println("Fail");
        }

    }

}
