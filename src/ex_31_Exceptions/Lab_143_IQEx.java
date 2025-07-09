package ex_31_Exceptions;

public class Lab_143_IQEx {
    public static void main(String[] args) {

        String num = null;

        try{
            num = args[0];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        int i =0;
        try{
             i = Integer.parseInt(num);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        int b =0;
        try{
            b = 100/i;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
