package ex_23_Access_Modifier;

public class lab_152_AM {
    public static void main(String[] args) {

    }
}

class father{
    private int gold = 100;
    int car = 1;
    public int BHk3 = 1;
}

class Son extends father{
    void wecanuse(){
        //System.out.println(gold);  // cant be used as it is private
        System.out.println(car); // default
        System.out.println(BHk3); // public
    }
}


