package ex_15_String;

public class Lab085_StringIQ {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="Hello"; //1 string in scp

        String s3= new String("Hello");
        String s4= new String("Hello");
        String s5= new String("hello"); // 3 strings created in object area

        System.out.println(s1==s3);// == comparison checks for location reference
        System.out.println(s1==s2);
        System.out.println(s3==s4);

        System.out.println(s1.equals(s3)); // equal checks for contents
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
