package ex_31_Exceptions;

public class Lab_139_IQ {
    public static void main(String[] args) {

        try{
            String input = args[0];
            int a = Integer.parseInt(input);
            int output = 100/0;
        }
        catch(NullPointerException | ArithmeticException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
