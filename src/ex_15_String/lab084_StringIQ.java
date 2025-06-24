package ex_15_String;

public class lab084_StringIQ {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3 = "hello";// only one String will be present in string constant pool


        String name= new String("Naseema")  ; // one string is created in Object area
        String name1= new String("Naseema")  ; //
        String name2= new String("Naseema")  ; // 3 in object area
    }
}
