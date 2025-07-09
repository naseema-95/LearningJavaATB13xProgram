package ex_31_Exceptions;

public class Lab_144_QA_Example {
    public static void main(String[] args) {

        try {
            String n1 = args[0];
            int i = Integer.parseInt(n1);
            int b = 100 / i;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
