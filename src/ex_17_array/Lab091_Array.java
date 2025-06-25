package ex_17_array;

public class Lab091_Array {
    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5}; //

        System.out.println(marks[0]);

        int[] mks = new int[3];  // fixed length array
        mks[0] = 6;
        mks[1] = 9;
        mks[2] = 10;

       // System.out.println(mks[4]); //ArrayIndexOutOfBoundsException

        String[] str = new String[3];
        str[0] = "Abdul";
        str[1] = "Riyaz";
        str[2] = "Naseema";

        System.out.println(str[2]);

        String[] str1 = {"Nasi","Ravi","Abdu","Hafi"};
        System.out.println(str1[3]);

        boolean[] b = new boolean[2];
        b[0] = false;
        b[1] = true;

        System.out.println(b[1]);
    }
}
