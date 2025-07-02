package ex_19_Constructor;

public class Lab111_Constructor {
    public static void main(String[] args) {
        webautomation wa1 = new webautomation();
        cars c1 = new cars();
        System.out.println(c1.name); // default value in the constructor gets printed
        c1.name= "Tesla";  // name can be changed here.
        System.out.println(c1.name);

    }
}
class webautomation{
    //Default Constructor
    webautomation(){

        System.out.println("Read data fro files");
        System.out.println("Connect to database");
        //        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
class cars{
    String name;
    String model;
    int year;

    //name =" Ferrari";  this should be done inside a method, constructor or initializer block

    cars(){
        name="unknown";
        model="XXX";
        year=1997;
    }
}