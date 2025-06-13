package ex_08_increment_decrement_operator;

public class Lab052_increment_operator {
    public static void main(String[] args) {

        String i_num = args[0];
        int i = Integer.parseInt(i_num);

        System.out.println("i is "+i);
        ++i; // pre increment; first increase the value and then store: 12
        System.out.println(i); // prints 12


        System.out.println("here at i++ :"+i++); // store and increment the value :13
        System.out.println(i); // prints 14

    }
}
