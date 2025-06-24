package ex_16_String_build_buffer;

public class Lab090_Vowels {
    public static void main(String[] args) {


        String input = "Java is a programming language";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++)
        {
          char  ch = input.charAt(i) ;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowel Count: "+vowels);
        System.out.println("Consonants Count: "+consonants);
    }
}
