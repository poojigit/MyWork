package LiskovSubsitution.example2;

public class Ostrich implements Bird{
    @Override
    public void eat() {
        System.out.println("Osctrich can eat");
    }
}
