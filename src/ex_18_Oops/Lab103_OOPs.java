package ex_18_Oops;

public class Lab103_OOPs {
    public static void main(String[] args) {

        Student s1 = new Student(); // the constructor will be called as the object creation is happening
        Student s2; // s2 is object reference;constructor will not be called as there is no object creation happening
        new Student(); // unammed object creation constructor will be called


    }
}
    class Student {
        String name;


        Student() {    //default constructor: name same as that of the class
            System.out.println("DC");
        }
    }

