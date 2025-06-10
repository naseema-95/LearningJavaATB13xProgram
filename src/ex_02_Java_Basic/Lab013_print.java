package ex_02_Java_Basic;

public class Lab013_print {
    public static void main(String[] args) {
        System.out.print("Demonstrate");
        System.out.print(" - print: to print in same line");
        System.out.println(" - print ln: to print in new line");
        System.out.print("test msg");
        System.out.println(" ");
        System.out.println(" - print f");

        int a =100;
        System.out.printf("the variable value is %d \n",a);

        int b= 12;
        int c= 13;
        System.out.printf("sum of %d and %d is %d",c,b,c+b);
    }
}
