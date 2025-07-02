package ex_19_Constructor;

public class Lab113_Parameter_Constructor {
    public static void main(String[] args) {

        Person p1= new Person("naseema",2345896l,"xyz");
        System.out.println(p1.name);
        System.out.println(p1.number);
        System.out.println(p1.address);

    }
}

class Person{
    String name;
    long number;
    String address;

    Person(String per_name, long per_num, String per_add){
        this.name=per_name;
        this.number=per_num;
        this.address=per_add;

    }
}
