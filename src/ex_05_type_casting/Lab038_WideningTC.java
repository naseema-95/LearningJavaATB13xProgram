package ex_05_type_casting;

public class Lab038_WideningTC {
    public static void main (String[] args) {
  // This represents the Widening typecasting concept
        /* Widening: converting smaller datatype into larger datatype which
           is implicitly done with data loss
         */

        byte a2=10;
        int b1 =a2;
        //System.out.println(((Object)b1).getClass().getSimpleName());

        System.out.println(b1);

        short q=23;
        int r = (int)q;

        System.out.println(r);
    }
}
