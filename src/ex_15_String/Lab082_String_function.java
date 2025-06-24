package ex_15_String;

public class Lab082_String_function {
    public static void main(String[] args) {
        char c='A';
        System.out.println(c);

        String s ="ABCD";
        System.out.println(s.length()); // length starts from 1
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.concat("E"));
    }
}
