package ex_03_Java_Literals;

public class Lab021_char_literals {
    public static void main(String[] args) {
        char c1='A';
        char c2='B';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='1';
        char c7='(';

//        Escape char
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("new word");
        System.out.println("line1"+new_line+"line2");
        System.out.println("new"+tab_line+"word");
        System.out.println("newo"+back_space+" word");
        System.out.println("new is now old"+carriage_return+" old word");

        System.out.println("This is new line"+new_line+"This is second line\n This is third line");

        char a=65;/* ascii value for A, this prints A*/
        System.out.println(a);
    }
}
