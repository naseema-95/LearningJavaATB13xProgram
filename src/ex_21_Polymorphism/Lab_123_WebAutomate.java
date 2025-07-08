package ex_21_Polymorphism;

public class Lab_123_WebAutomate {
    public static void main(String[] args) {

        startBrowser sb1 = new startBrowser();
        sb1.browser();
        sb1.browser("Chrome");

    }
}

class startBrowser{

    void browser(){
        System.out.println("Starting default browser");
    }

    String browser(String b){
        System.out.println("Starting browser "+b);
        return b;
    }
}
