package Multithreading.example2;

public class Waiter extends Thread{
    private FoodCounter foodCounter;
    public Waiter(FoodCounter foodCounter){
        this.foodCounter=foodCounter;
    }

    public void run(){
        for(int i=0;i<3;i++){
            String food=foodCounter.served();
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
