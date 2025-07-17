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
}
