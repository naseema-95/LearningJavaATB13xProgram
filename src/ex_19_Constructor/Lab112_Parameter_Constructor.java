package ex_19_Constructor;

public class Lab112_Parameter_Constructor {
    public static void main(String[] args) {

        BabyA b2 = new BabyA();
        System.out.println(b2.name);

        BabyA b1= new BabyA("naseema",1995,06,0,"Female");
        System.out.println(b1.name);
        System.out.println(b1.year);
        System.out.println(b1.month);
        System.out.println(b1.day);
        System.out.println(b1.gender);

    }
}
class BabyA{
    //instance variables
    String name;
    int year;
    int month;
    int day;
    String gender;

    BabyA(){
        name="Riaz";
    }

    BabyA(String baby_name, int baby_year, int baby_month, int baby_day, String baby_gender){
        this.name=baby_name;
        this.year=baby_year;
        this.month=baby_month;
        this.day=baby_day;
        this.gender=baby_gender;
    }
}
