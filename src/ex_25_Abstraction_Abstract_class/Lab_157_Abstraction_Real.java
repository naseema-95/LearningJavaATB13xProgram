package ex_25_Abstraction_Abstract_class;

public class Lab_157_Abstraction_Real {
    public static void main(String[] args) {

        Company c1 = new Company();
        double ret=c1.computePay();
        System.out.println(ret);

    }

}

class Company extends Employee{

    @Override
    double computePay(){
        return 1000;
    }
}

abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("Default Constructor");
    }

    Employee(String name, String address, int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailcheck(){
        System.out.println("Mailing a check to "+this.name+" "+ this.address);
    }
}
