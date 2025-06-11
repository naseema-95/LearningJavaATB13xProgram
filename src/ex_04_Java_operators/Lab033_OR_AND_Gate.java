package ex_04_Java_operators;

public class Lab033_OR_AND_Gate {
    public static void main(String[] args) {
        //implementing and or gate
        System.out.println("And Gate");
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && true);
        System.out.println(false && false);

        System.out.println();
        System.out.println("OR Gate");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

    }
}
