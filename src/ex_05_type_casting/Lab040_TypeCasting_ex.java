package ex_05_type_casting;

public class Lab040_TypeCasting_ex {
    public static void main(String[] args) {
// proper datatypes should be selected for type caste to avoid data loss
        int cost = 100;
        float gst = 14.8f;

        int total = cost+(int)gst; //convert float to int there is loss of data Narrowing TC

        System.out.println(total);

        float total1 = cost+gst;

        System.out.println(total1);//Widening no loss of data
    }
}
