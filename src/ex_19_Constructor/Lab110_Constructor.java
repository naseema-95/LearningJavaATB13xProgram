package ex_19_Constructor;

public class Lab110_Constructor {
    public static void main(String[] args) {
        Baby b1 =  new Baby();
        b1.cry();
    }
}

class Baby{
    //baby attributes
    String name;

    Baby(){
        System.out.println("I am called");
    }

    //baby behavior
    void cry(){
        System.out.println("baby cries");
    }
}