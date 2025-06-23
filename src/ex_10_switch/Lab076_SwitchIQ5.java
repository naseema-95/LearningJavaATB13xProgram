package ex_10_switch;

public class Lab076_SwitchIQ5 {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.

        int itemCode = 0023;

        switch(itemCode) {
            case 001 -> System.out.println("fridge");
            case 002 -> System.out.println("Board");
            default -> System.out.println("Invalid input");
        }
    }
}
