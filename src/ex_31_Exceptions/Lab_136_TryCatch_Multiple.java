package ex_31_Exceptions;

public class Lab_136_TryCatch_Multiple {
    public static void main(String[] args) {

        int a = 0;

        try{
            a=10/0;
        }catch(ArithmeticException e){
            System.out.println("Divide by zero arithemetic exception");
        }catch(Exception e){
            System.out.println("Exception bucket");
        }
        System.out.println(2);
    }
}
