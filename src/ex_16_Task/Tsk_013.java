package ex_16_Task;

public class Tsk_013 {
    public static void main(String[] args) {

        int i = 43;

        if(i <= 1){
            System.out.println(i+" is not prime");
        }
        if(i == 2){
            System.out.println(i +" is prime");
        }
        if(i % 2 == 0) {
            System.out.println(i + " is not prime");
        }

        for(int j = 3; j*j <= i ; j += 2 ){
            if(i % j == 0){
                System.out.println(i + " is not prime");
            }

        }
        System.out.println(i + " is prime");
    }
}
