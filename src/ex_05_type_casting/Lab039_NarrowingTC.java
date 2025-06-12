package ex_05_type_casting;

public class Lab039_NarrowingTC {
    public static void main(String[] args) {
//This is for Narrowing TypeCasting
//Narrowing TC: converting a larger data type into a smaller datatype, there is some data loss involved
        float f= 10.3f;
       // int i = f; // this is not allowed
        int i=(int)f;
        System.out.println(i);

        int val=300;
        byte b=(byte)val;
        System.out.println(b);

    }
}
