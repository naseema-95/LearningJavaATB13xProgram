package ex_28_Static_IIB;

public class Lab_164_Static {
    public static void main(String[] args) {

        new B(10);
    }
}

class B{
    int a;
    static int b = 20;

    static {
        System.out.println("This is static block");
    }
    {
        System.out.println("IIB Block");
    }

    void display(){
        System.out.println("Non static method");
        System.out.println(this.a);
    }
    
    B(int a){
        this.a=a;
    }

    static void commmonToALL(){
        System.out.println("Static Method");
    }

    static class c{

    }
}


