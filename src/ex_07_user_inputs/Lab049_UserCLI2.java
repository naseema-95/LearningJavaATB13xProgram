package ex_07_user_inputs;

public class Lab049_UserCLI2 {
    public static void main (String[] args) {
        System.out.println(args[0]); //ArrayIndexOutOfBoundsException is raised when no elements are given
        System.out.println(args[1]); //args[0]: 12 args[1]: 3 args[2]: Naseema
        System.out.println(args[2]); // it takes string value as well
    }
}
