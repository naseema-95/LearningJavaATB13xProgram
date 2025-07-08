package ex_21_Polymorphism;

public class Lab_126_MOverriding_automate {
    public static void main(String[] args) {

        chrome c1 = new chrome();
        c1.browser();

        firefox f1 = new firefox();
        f1.browser();

        commtoall c2= new commtoall();
        c2.browser();

        //Dynamic Dispatch
        commtoall c3 = new chrome();
        c3.browser();


        commtoall c4 = new firefox();
        c4.browser();

    }
}

class commtoall{

    void browser(){
        System.out.println("Starting default browser");
    }
}

class chrome extends commtoall{

    @Override
    void browser(){
        System.out.println("Starting chrome browser");
    }
}

class firefox extends commtoall{

    @Override
    void browser(){
        System.out.println("Startin firefox browser");
    }
}