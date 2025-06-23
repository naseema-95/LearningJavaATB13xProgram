package ex_10_switch;

import java.util.Scanner;

public class Lab070_Switch_RealCase {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser details to start");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        System.out.println("Broswer is :" + browser);

        switch (browser){
            case "chrome" :
                System.out.println("Starting the "+browser);
                System.out.println("......");
                break;
            case "firefox"    :
                System.out.println("Starting the "+browser);
                //Webdriver driver= new Firefox();
                break;
            case "edge":
                System.out.println("Starting the "+browser);
                break;
            default:
                System.out.println("Please provide a valid browser");
                break;

                }


    }
}
