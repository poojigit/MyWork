package Semaphore.example1;
import  java.util.concurrent.Semaphore;



public class IncrementCount {

    String name;
    Semaphore sem;

    IncrementCount(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
        new Thread(r1).start();
    }


    Runnable r1=()->{
        try{
            System.out.println(name+"is waiting for a permit");

            sem.acquire();
            System.out.println(name+"gets a permit");

            for(int i=0;i<5;i++){
                Shared.count++;
                System.out.println(name+":"+Shared.count);
                Thread.sleep(10);
            }
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(name+"release the permit");

        sem.release();

    };



}
