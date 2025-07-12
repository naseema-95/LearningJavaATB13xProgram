package ex_24_Super_Keyword;

public class Lab_153_Super {
    public static void main(String[] args) {

        Car c2 = new Car(100);
        c2.display();
    }
}

class vehicle{
   public int maxSpeed = 180;

   vehicle(){
       System.out.println("DC");
   }

   vehicle(int a){
       System.out.println("Param Constructor " +a);
   }
//overloading the function
   void Message(){
       System.out.println("Type 1");
   }

   void Message(int a){
       System.out.println("Type 2");
   }

   int Message(String y){
       System.out.println("type 4");
       return 0;
   }

   void display(){
       System.out.println("vehicle parent");
   }

}

class Car extends vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setmaxSpeed(){
        this.maxSpeed = maxSpeed;
    }

    public Car(){
        super();
        System.out.println("default Car constructor");
    }

    public Car(int a){
        super(a);
        System.out.println("param constructor of Car");
    }

   @Override
    void display(){
       System.out.println(super.maxSpeed);
       System.out.println(this.maxSpeed);
        System.out.println("This is override display function");
    }


}
