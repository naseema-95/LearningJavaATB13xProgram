package ex_16_Task;

import org.w3c.dom.ls.LSOutput;

public class Tsk_007 {
    public static void main(String[] args) {


        int a = 12;
        int b = 13;
        int c = 11;

        int result = (a > b) && (a > c) ? a : (b > c) ? b : c;

        System.out.println("Greater number is :" +result);

    }
}
