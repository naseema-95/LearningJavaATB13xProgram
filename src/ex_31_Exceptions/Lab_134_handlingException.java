package ex_31_Exceptions;

public class Lab_134_handlingException {
    public static void main(String[] args) {
        int a = 0;
        //Unchecked exception as the exception is thrown during runtime

        try{
            a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Divide by 0 not allowed");
        }


        System.out.println(a);
    }
}
