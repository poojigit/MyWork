package CountDownLatch.example2;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample2 {

    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(3);
        System.out.println("Starting services......");

        new Thread(()->startService("Database service",2000,latch)).start();
        new Thread(()->startService("Cache service",3000,latch)).start();
        new Thread(()->startService("Messaging service",1000,latch)).start();

        try{
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All services ready. Starting Main Application....");
    }

    private static void startService (String serviceName, int delay, CountDownLatch latch){
        try{
            System.out.println(serviceName +"is starting....");
            Thread.sleep(delay);
            System.out.println(serviceName+"is ready...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            latch.countDown(); //Mark this service as completed
        }
    }
}
