package ex_30_wrapper;

public class Lab_171_WrapperConversion {
    public static void main(String[] args){

        int a= 10;
        Integer b = a;
        //this is caled boxing, JVM will conert it automatically
        System.out.println(b);


        Double d = 2.443;
        double d1 = d;
        //this is called unboxing
        System.out.println(d);
    }
}
