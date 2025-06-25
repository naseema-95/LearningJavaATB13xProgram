package ex_17_array;

public class Lab098_ArrayCLI {
    public static void main(String[] args) {

        for(int i =0; i < args.length; i++){
            System.out.println(args[i]);
        }

        for(String arg1:args){
            System.out.println(arg1);
        }
    }
}
