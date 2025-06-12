package ex_06_ternary_operators;

public class Lab047_Grade {
    public static void main(String[] args) {

        int mark = 95;

        String result = ( mark >= 90) ? "A+" :
                (mark >= 75 ) ? "A" :
                        (mark >= 60 ) ? "B" :
                                ( mark >= 40 ) ? "C" : "Fail";

        System.out.println("Mark : "+mark);
        System.out.println("Result : "+result);
    }
}
