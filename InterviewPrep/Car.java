package InterviewPrep;

public class Car {

    String brand;
    int price;

    void showDetails(){
        System.out.println("Brand " +brand+ ", Price " +price);
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="Hyundai";
        c1.price=500000;
        c1.showDetails();
    }
}
