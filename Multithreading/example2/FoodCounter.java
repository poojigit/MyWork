package Multithreading.example2;

public class FoodCounter {
    private String food;
    private boolean hasFood=false;

    public void prepared(String food){
        synchronized(this){
            while (hasFood){
                try{
                    wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            this.food=food;
            hasFood=true;
            System.out.println("Chef has prepared the food:" +food);
            notify();
        }

    }


    public String served(){
        synchronized (this){
            while(!hasFood){
                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            hasFood=false;
            System.out.println("Waiter has served the food:" +food);
            notify();
            return food;
        }
    }

}
