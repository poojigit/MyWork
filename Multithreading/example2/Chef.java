package Multithreading.example2;

public class Chef extends Thread {
    private FoodCounter foodCounter;
    public Chef(FoodCounter foodCounter){
        this.foodCounter=foodCounter;
    }

    public void run(){
        String[]foods={"Burger","Pasta","Noodles"};
        for(String food:foods){
            try{
                Thread.sleep(1000);
                foodCounter.prepared(food);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
