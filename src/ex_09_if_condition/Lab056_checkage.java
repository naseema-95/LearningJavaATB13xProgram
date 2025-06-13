package ex_09_if_condition;

public class Lab056_checkage {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        System.out.println("the age entered is: "+age);

        if (age >= 18){
            System.out.println("Allowed to vote");
        }
    }
}
