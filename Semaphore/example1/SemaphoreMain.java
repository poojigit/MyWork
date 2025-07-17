package Semaphore.example1;

import Semaphore.expample2.TrafficLight;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

    public static void main(String[] args) {

        Semaphore sem=new Semaphore(1);
        new IncrementCount(sem,"A");
        new DecrementCount(sem,"B");

        new TrafficLight(sem,"T1");
        new TrafficLight(sem,"T2");
        /*new TrafficLight(sem,"T3");
        new TrafficLight(sem,"T4");*/

    }

}


