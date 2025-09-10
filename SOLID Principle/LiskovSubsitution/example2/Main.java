package LiskovSubsitution.example2;

public class Main {
    public static void main(String[] args) {

        System.out.println("About Sparrow");
        Sparrow sparrow=new Sparrow();
        sparrow.eat();
        sparrow.fly();
        sparrow.haveFeathers();
        sparrow.layEggs();
        sparrow.layEggs();

        System.out.println("About Ostrich");
        Ostrich ostrich=new Ostrich();
        ostrich.eat();
        ostrich.layEggs();
        ostrich.haveFeathers();
        ostrich.sleep();

    }
}
