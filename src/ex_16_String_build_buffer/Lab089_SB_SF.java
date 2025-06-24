package ex_16_String_build_buffer;

public class Lab089_SB_SF {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Naseema");
        sb.append(" Banu");
        System.out.println(sb);

        System.out.println(sb.reverse());

        String s1 = "Hello";
        String s2 = " World";

        System.out.println(s1+s2);
        sb.append(1234);

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        sb1.reverse();
        System.out.println(sb1);
    }
}
