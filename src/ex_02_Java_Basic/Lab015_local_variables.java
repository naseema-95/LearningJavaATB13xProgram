package ex_02_Java_Basic;

public class Lab015_local_variables {
    public static void main(String[] args) {
        int a =10;
        byte b= 20;
        short c=30;
        long d= 400000000000L;
        float f= 2.34F;
        double r=4.8889909998899;
        boolean b1=true;
        char h='T';

        int local;
//        this declaration will not work as JVM will not assign default value for local variable


        {
            int j=10;
            System.out.println(j);

        }
        int j=90;
        System.out.println(j);

    }
}
