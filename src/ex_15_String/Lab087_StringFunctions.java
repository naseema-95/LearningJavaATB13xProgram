package ex_15_String;

public class Lab087_StringFunctions {
    public static void main(String[] args) {
        String name = "Naseema";

        System.out.println(name.length());
        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(8)); //StringIndexOutOfBoundsException

        System.out.println(name.concat(" Banu"));
        System.out.println(name.contains("ok"));
        System.out.println(name.equals("Naseema"));
        System.out.println(name.equalsIgnoreCase("naseema"));

        //System.out.println(name.indexOf('n')); this gives -1 as n doesnot exists
        System.out.println(name.indexOf('a'));

        String s1 ="madam";
        System.out.println(s1.indexOf('m')); //returns the first index of the substring
        System.out.println(s1.lastIndexOf('m'));

        System.out.println(name.length());
        System.out.println(name.replace('N','n'));

        String mail ="naseema@95.banu@gmail.com";
        String[] splits = mail.split("@");
        System.out.println(splits[1]);
        System.out.println(splits[0]);
        System.out.println(splits[2]);

        System.out.println(name.substring(1,3));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("s"));
        System.out.println(name.endsWith("a"));

        String anpal = "Niagara. O roar again!";
        System.out.println(anpal.length());

        String extract = anpal.substring(10,20);
        System.out.println(extract);

        String result = name + s1;
        System.out.println(result);

        String n = "NaseEMabAnu";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("s"));
        System.out.println(n.lastIndexOf("U"));




    }
}
