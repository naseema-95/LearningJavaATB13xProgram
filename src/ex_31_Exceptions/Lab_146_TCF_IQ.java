package ex_31_Exceptions;

public class Lab_146_TCF_IQ {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try{
            int x = 10/a;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I will be executed anyways");
        }
    }
}
