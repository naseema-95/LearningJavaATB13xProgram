package ex_18_Oops;

public class Lab104_Cats {
    Lab104_Cats(){
        String name1;  //can be created in main class as well but no use here
    }
    public static void main(String[] args) {
        cat c1 = new cat();
        new cat();
        cat c2; // errored as this is ot initialised

        c1.running();
        // c2.running();
        new cat().running();

    }
}
class cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}