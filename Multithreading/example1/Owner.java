package Multithreading.example1;

public class Owner extends Thread{
    private PostBox postBox;
    public Owner(PostBox postBox){

        this.postBox=postBox;
    }
    public void run(){
        for(int i=0;i<3;i++) {
            String letter = postBox.pick();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
