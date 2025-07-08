package ex_22_encapsulation;

public class Lab_127_Encap_demao {
    public static void main(String[] args) {

        VWOLogin v1 = new VWOLogin("admin","pass123");
        System.out.println(v1.username);
        System.out.println(v1.password);

        enVWOLogin v2 = new enVWOLogin("admin","p123");
        // Cannot be accessed as these are private attributes
        //System.out.println(v2.user);
        //System.out.println(v2.pass);
        System.out.println(v2.getUser());
        System.out.println(v2.getPass());

        v2.setPass("p345678",true);
        String p = v2.getPass();
        System.out.println(p);

    }
}
// creating a class without encapsulation
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password){
        this.username=username;
        this.password= password;

    }
}

class enVWOLogin{
    private String user;
    private String pass;

    public enVWOLogin(String usr, String pwd){
        this.user=usr;
        this.pass=pwd;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass, boolean isadmin) {
        if(isadmin){
            this.pass = pass;
        } else{
            System.out.println("Not entitled to change password");
        }

    }



}
