package ex_31_Exceptions;

public class Lab_138_Try_IQ {
    public static void main(String[] args) {
        String name = null;
        int a = 0;
        try{
            name.trim();
            int result = 100/a;
        }
        catch(NullPointerException | ArithmeticException e){
            System.out.println("Null or Arth Exception");
        }catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("End");
    }
}
