package ex_16_String_build_buffer;

public class Lab088_SB_SF {
    public static void main(String[] args) {
        String s0 = "Naseema";
        String s1 = new String("Banu");

        StringBuilder stringbuilder = new StringBuilder("Spend");
        StringBuffer stringbuffer = new StringBuffer("Wisely");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringbuilder);
        System.out.println(stringbuffer);
    }
}
