package InterfaceSegregation.example2;

public class HumanWorker implements Human, Machinery {
    @Override
    public void eat() {
        System.out.println("Human need some food to work");
    }

    @Override
    public void sleep() {
        System.out.println("Human needs some sleep");

    }

    @Override
    public void work() {
        System.out.println("Human can work according to their will power");

    }
}
