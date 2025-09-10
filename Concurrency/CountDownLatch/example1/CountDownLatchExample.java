package CountDownLatch.example1;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(3);
        for(int i=0;i<3;i++){
            new Thread(()->{
                System.out.println("Task completed by Thread" +Thread.currentThread().threadId());
                latch.countDown();
            }).start();
        }

        try {
            latch.await();

            System.out.println("All tasks completed.Processing to the next step!");
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }

}
