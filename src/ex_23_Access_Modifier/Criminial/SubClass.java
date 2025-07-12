package ex_23_Access_Modifier.Criminial;

import ex_23_Access_Modifier.police.Cop;

public class SubClass extends Cop {

    public SubClass(int bullet){
        super(bullet);
    }

    public static void main(String[] args) {
        new SubClass(10).canIshoot();
       // new SubClass(10).thisDefaultF1(); this cant be accessed.
    }

}
