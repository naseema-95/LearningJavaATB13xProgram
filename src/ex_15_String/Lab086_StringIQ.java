package ex_15_String;

public class Lab086_StringIQ {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        System.out.println(str1 == str2); // string constant pool so true location is same
        System.out.println(str1 == str3); // str3 in object area so false
        System.out.println(str1.equals(str3)); // contents are same so true
    }
}
