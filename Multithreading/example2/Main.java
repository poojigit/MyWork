package Multithreading.example2;

public class Main {
    public static void main(String[] args) {
        FoodCounter foodCounter=new FoodCounter();
        new Chef(foodCounter).start();
        new Waiter(foodCounter).start();
    }
}
