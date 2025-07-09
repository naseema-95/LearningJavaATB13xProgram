package ex_31_Exceptions;

public class Lab_135_TryCatch {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a = 10/0;
        }
        catch(Exception e){
            System.out.println("Divide by 0 not allowed");
        }
        System.out.println("2");
    }
}
