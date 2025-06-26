package ex_16_Task;

public class Tsk_008 {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int c = 10;


        int result = (a < b ) && (a < c) ? a : (b < c) ? b : c;
        System.out.println(result);
    }
}
