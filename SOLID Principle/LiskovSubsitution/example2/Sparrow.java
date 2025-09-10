package LiskovSubsitution.example2;

public class Sparrow implements FlyingBird{


    @Override
    public void fly() {

        System.out.println("Sparrow can fly");
    }

    @Override
    public void eat() {

        System.out.println("Sparrow can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow can sleep");
    }

    @Override
    public void layEggs() {
        System.out.println("Sparrow can lay eggs");

    }

    @Override
    public void haveFeathers() {
        System.out.println("Sparrow have feathers");

    }
}
