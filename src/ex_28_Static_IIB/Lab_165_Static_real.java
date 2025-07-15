package ex_28_Static_IIB;

public class Lab_165_Static_real {
    public static void main(String[] args) {

        new ATB();
    }

}

class ATB{
    static{
        System.out.println("Class loaded, method printed");
    }
    {
        System.out.println("IIB Block- called when object is created");
    }
    private String name;
    private long phone;

    public String getName(){
        return name;
    }
    public long getPhone(){
        return phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    static String courseName="ATBX";
    static String MentorName = "Pramod";

    static void doAssignment(){
        System.out.println("Do assignment");
    }

    static void joinClass(){
        System.out.println("Class joined");
    }

    void howdoAssignment(){
        System.out.println("Doing Assignment is based on individual");
    }

}
