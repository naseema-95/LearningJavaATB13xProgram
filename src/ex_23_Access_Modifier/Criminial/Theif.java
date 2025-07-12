package ex_23_Access_Modifier.Criminial;

import ex_23_Access_Modifier.police.Cop;

public class Theif {
    public static void main(String[] args) {

        Cop theif = new Cop(10);
        theif.gun = 100;
        //theif.canIshoot();

    }
}
