package ex_20_Inheritance.Hierarchy;



public class Lab120_hierarchy_inheritance {
    public static void main(String[] args) {

        Father f1 = new Father();
        ruhani r = new ruhani();

        r.home1();
        r.h2();

        naseema n1 = new naseema();
        n1.home1();
        n1.h3();

        abdul a1 = new abdul();
        a1.home1();
        a1.h4();



    }
}

class Father{
    void home1(){
        System.out.println("3 BHK");
    }
}

class ruhani extends Father{
    void h2(){
        System.out.println("h2");
    }
}

class naseema extends Father{
    void h3(){
        System.out.println("h3");
    }
}

class abdul extends Father{
    void h4(){
        System.out.println("h4");
    }
}