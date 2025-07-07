package ex_20_Inheritance;

public class Lab115_Inheritance {
    public static void main(String[] args){

        father f1 = new father();
        System.out.println(f1.gold_f);
        f1.BHK_2();

        son s1 = new son();
        System.out.println(s1.gold_f);
        s1.BHK_2();
        s1.BHK_3();


    }
}

class father{
    int gold_f = 1000;

    void BHK_2(){
        System.out.println("Father 2BHK");
    }
}

class son extends father{
    void BHK_3(){
        System.out.println("Son 3BHK");
    }

}