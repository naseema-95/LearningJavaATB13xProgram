package ex_04_Java_operators;

public class Lab026_Relational_operator {
    public static void main(String[] args) {
        /*
        > --> greater than
        < --> less than
        >= --> greater than/ equal to
        >= --> less than/equal to
        != --> not equal to
        == --> comparison
         */
        int age1=30;
        int age2=40;
        boolean c1= age1 > age2;
        System.out.println(c1);

        boolean c2 = age1 < age2;
        System.out.println(c2);

        boolean c3 = age2 >= age1;
        System.out.println(c3);

        boolean c4 = age2 <= age1;
        System.out.println(c4);

        boolean c5 = age1==age2;
        System.out.println(c5);

        boolean c6 = age1 != age2;
        System.out.println(c6);

    }
}
