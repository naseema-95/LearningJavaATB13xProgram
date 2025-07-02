package ex_19_Constructor;

public class Lab114_Constructor_overloading {
    public static void main(String[] args) {

        Person2 p12 = new Person2("Naseema");
        System.out.println(p12.name);

        Person p13 = new Person("Riaz",63,"XYZ");
        System.out.println(p13.name);
        System.out.println(p13.number);
        System.out.println(p13.address);


    }
}

class Person2{
    String name;
    int age;
    String address;

    Person2(String name){
        this.name=name;

    }

    Person2(String name,int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;

    }
}
