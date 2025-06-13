package ex_07_user_inputs;

public class Lab048_UserCLI {
    public static void main(String[] args) {

        String age_input = args[0];
        int age = Integer.parseInt(age_input);
        String canVote = (age >= 18) ? "Yes" : "No";
        System.out.println("Can the user vote: "+ canVote+ " Vote age: "+age);
    }
}
