package ex_22_encapsulation;

public class Lab_130_Real_Encap_bank {
    public static void main(String[] args) {

        Bank bk = new Bank("cashier",100);
        System.out.println(bk.getBal());
        System.out.println(bk.getRole());
        bk.setBal(500,false);
        long p1 = bk.getBal();
        System.out.println(p1);

    }
}

class Bank{
    private long bal;
    private String role;

    public Bank(String r1, long b1){
        this.role = r1;
        this.bal = b1;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getBal(){
        return bal;
    }

    public void setBal(long bal, boolean isCashier){
        if(isCashier){
            this.bal=bal;
        }else{
            System.out.println("you are not allowed to change the balance");
        }
    }
}
