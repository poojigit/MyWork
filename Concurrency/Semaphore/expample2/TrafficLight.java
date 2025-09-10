package Semaphore.expample2;

import java.util.concurrent.Semaphore;

public class TrafficLight {

    String name;
    Semaphore sem;

    public TrafficLight(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
        new Thread(r1).start();
    }

    Runnable r1=()->{
        try {
            sem.acquire();
            System.out.println(name + " is green");
            Thread.sleep(5000);
            System.out.println(name + " is yellow");
            Thread.sleep(3000);
            System.out.println(name + " is red");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+ " release the permit");
        sem.release();
    };

}
