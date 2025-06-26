package ex_14_Functions;

public class Lab104_UDF_IQ {
    public static void main(String[] args) {
        // This is to explain main function over loading
        // multiple main methods but with different data type

    }

    public static void main(String args) {
        System.out.println("Hello");

    }

    public static int main(int args) {
        return 10;

    }

    public static float main(float args) {
        return 10.67f;

    }

    public static boolean main(boolean args) {
        return false;

    }
}
