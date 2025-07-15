package Ex_29_Enum;

public class Lab_168_Enum {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_pass.getLocators());
        System.out.println(Locators.page_button.getLocators());


        System.out.println(Colors.RED.getColors());
        System.out.println(Colors.BLUE.getColors());
        System.out.println(Colors.GREEN.getColors());
        System.out.println(Colors.YELLOW.getColors());

        System.out.println(RestAPI.vwo.getApiurls());
        System.out.println(RestAPI.google.getApiurls());
    }
}
