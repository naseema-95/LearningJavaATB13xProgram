package ex_31_Exceptions;

public class Lab_149_Throw {
    public static void main(String[] args) {

        divideByZero(0);

    }
    static void divideByZero(int a){
        if(a == 0){
                throw new ArithmeticException("Error e==0");
        }
    }
}
