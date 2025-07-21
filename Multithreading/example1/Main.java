package Multithreading.example1;

public class Main {
    public static void main(String[] args) {
        PostBox postBox=new PostBox();
        new Owner(postBox).start();
        new Postman(postBox).start();
    }
}
