package ex_26_Abstraction_Interface;

public class Lab_161_IQ {

}

interface II1{}
interface II2{}

class A1{}
class A2{}

abstract class nasee{
    abstract void p1();
}

class test extends A1{}
//class test1 extends A1,A2{}  multiple inheritence not possible
class test3 implements II1{}
class t3 implements II1,II2{}

class t5 extends A1 implements II1,II2{}

interface if4{
    default void m1(){

    }
    default void m2(){

    }

    static void m3(){

    }
}
