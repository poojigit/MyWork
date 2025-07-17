package LiskovSubsitution.example2;

public class Main {

    public static void makeItFly(FlyingBird bird){

        bird.fly();
    }

    public static void makeItEat(Bird birds){

        birds.eat();
    }

    public static void main(String[] args) {
        FlyingBird sparrow=new Sparrow();
        makeItFly(sparrow);
        makeItEat(sparrow);
        Bird ostrich=new Ostrich();
        makeItEat(ostrich);

    }
}
