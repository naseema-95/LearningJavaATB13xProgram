package ex_31_Exceptions;

public class Lab_145_Sr_QA_Ex {
    public static void main(String[] args) {
        try{
            String ip = args[0];
            int i = Integer.parseInt(ip);
            int b = 100/i;
        }
        catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
