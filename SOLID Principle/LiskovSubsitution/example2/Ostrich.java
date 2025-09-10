package LiskovSubsitution.example2;

public class Ostrich implements Bird{
    @Override
    public void eat() {

        System.out.println("Ostrich can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Ostrich can sleep");
    }

    @Override
    public void layEggs() {
        System.out.println("Ostrich can lay eggs");
    }

    @Override
    public void haveFeathers() {
        System.out.println("Ostrich have feathers");

    }
}
