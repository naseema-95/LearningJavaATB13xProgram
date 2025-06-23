package ex_10_switch;

public class Lab060_Switchnobreak {
    public static void main(String[] args) {

        int day = Integer.parseInt(args[0]);

        switch (day) {
            case 1:
                System.out.println("sunday");
            case 2:
                System.out.println("Monday");
            default:
                System.out.println("enter a valid value"); // runs all the cases as there is no break
        }
    }
}
