package ex_28_Static_IIB;

public class Lab_166_Web_Automation {
    public static void main(String[] args) {

        Automation a1 = new Automation();
        System.out.println(Automation.driver);

        Automation a2 = new Automation();
        System.out.println(Automation.driver);
    }
}

class Automation{
    static String driver= "Chrome";
}
