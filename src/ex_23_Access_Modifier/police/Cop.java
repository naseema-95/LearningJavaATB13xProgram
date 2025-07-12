package ex_23_Access_Modifier.police;

public class Cop {

    public int gun;
    private String icard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    protected void canIshoot() {
        System.out.println("Yes, I can shoot");
    }
    void thisDefaultF1(){
        System.out.println("Hi, Cop.!");
    }
}
