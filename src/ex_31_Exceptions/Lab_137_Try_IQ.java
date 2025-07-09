package ex_31_Exceptions;

public class Lab_137_Try_IQ {
    public static void main(String[] args) {

        try{
            int a = 10/0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
