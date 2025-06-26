package ex_16_Task;

public class Tsk_010 {
    public static void main(String[] args) {
        //leap year check

        int year = 2001;

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)){
            System.out.println("Given year "+ year + " is leap year");
        } else{
            System.out.println(year+" Not a Leap Year");
        }
    }
}
