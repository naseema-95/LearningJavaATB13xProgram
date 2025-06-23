package ex_10_switch;

public class Lan072_SwitchIQ1 {
    public static void main(String[] args) {

        char ch ='A';

        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("not match");
                break;
        }
    }
}
