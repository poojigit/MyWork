package InterfaceSegregation.example2;

public class RobotWorker implements Machinery{
    @Override
    public void work() {
        System.out.println("Robot is a machine and can work for infinite time");
    }
}
