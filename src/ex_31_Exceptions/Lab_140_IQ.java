package ex_31_Exceptions;

public class Lab_140_IQ {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try{
            b = 10/c; //vulnerable code should be in try block
        }catch(ArithmeticException e ){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
