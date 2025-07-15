package ex_30_wrapper;

public class Lab_172_WrapperConversion {
    public static void main(String[] args) {

        String num = "10";
        //String to wrapper
        Integer num1 = Integer.parseInt(num);
        Integer num2 = Integer.valueOf(num);

        //wrapper to primitive
        int aa = Integer.parseInt(num);

        //Wrapper to String
        System.out.println(num1.toString());

        //primitive to string
        int age = 35;
        Integer wrapper_age = age;
        System.out.println(wrapper_age.toString());


    }
}
