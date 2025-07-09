package ex_31_Exceptions;

public class Lab_131_Exceptions {
    public static void main(String[] args) {
        System.out.println("Starting the Program");
        //Handle all the exceptions
        String input = args[0];//no input passed ArrayIndexOutOfBoundException
        int a = Integer.parseInt(input);//when passed string in place of integer gives NumberFormatException
        int output = 100/a; //when input passed 0, this will give Arithematic Exception
        System.out.println(output);
        System.out.println("End of program");

    }
}
