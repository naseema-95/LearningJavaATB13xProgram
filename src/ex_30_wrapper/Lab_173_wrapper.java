package ex_30_wrapper;

public class Lab_173_wrapper {
    public static void main(String[] args) {

        Mobile oneplus = new Mobile(1234,"oneplus9rt",42000.00);

        oneplus.setPrice(49280.765);
        oneplus.display();
        System.out.println(Mobile.carrier);
        Mobile.switchAirplanmode();

        System.out.println(Covers.red.getCovers());
    }
}

enum Covers{
    red("pokemon"),
    blue("dora");

    private String covers;

    Covers(String covers){
        this.covers= covers;
    }

    String getCovers(){
        return this.covers;
    }

}
class Mobile extends oldphone{
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Integer phone;
    private String name;
    private Double price;
    static String carrier="airtel";


    Mobile(){
        System.out.println("DC");
    }

    Mobile(Integer phone, String name, Double price){
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(this.phone+this.name+this.price);
    }

    void priceChange(Integer price){
        System.out.println("Price change in integers");
    }

    void priceChange(Double price){
        System.out.println("Price change in Double");
    }

    static void switchAirplanmode(){
        System.out.println("Common Airplane mode");
    }

    @Override
    void calling(){
        System.out.println("new model touchpad from dailpad");
    }


}

class oldphone implements simcard{

    @Override
    public void enterCard(){
        System.out.println("Card entered");
    }

    void calling(){
        System.out.println("Dailpad");
    }
}

interface simcard{
    void enterCard();
}