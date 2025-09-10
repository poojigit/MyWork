package InterfaceSegregation.example2;


public class Main {
    public static void main(String[] args) {
        HumanWorker humanWorker=new HumanWorker();
        humanWorker.eat();
        humanWorker.sleep();
        humanWorker.work();

        RobotWorker robotWorker=new RobotWorker();
        robotWorker.work();
    }
}
