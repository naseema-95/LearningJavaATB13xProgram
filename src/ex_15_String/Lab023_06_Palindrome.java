package ex_15_String;

import java.util.Scanner;

public class Lab023_06_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sting to be tested");

        String org_string = scan.next();
        String rev_string =  "";

        System.out.println("Entered String is:  "+ org_string);

        for(int j = org_string.length()-1;j >= 0; j--)  {
            rev_string += org_string.charAt(j);
        }
        if(rev_string.equals(org_string)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
