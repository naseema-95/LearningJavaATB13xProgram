package ex_10_switch;

public class Lab077_SwitchJdk {
    public static void main(String[] args) {
        //jdk 13

        int itemcode = 000;

        switch(itemcode) {
            case 001,002,003:
                System.out.println("All are electronic items");
                break;
            case 004,005,006:
                System.out.println("All are mechanical items");
                break;
            default:
                System.out.println("Enter valid itemcode");
                break;
        }


    }
}
