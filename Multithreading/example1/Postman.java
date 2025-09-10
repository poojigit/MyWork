package Multithreading.example1;

public class Postman extends Thread{
    private PostBox postBox;
    public Postman(PostBox postBox){

        this.postBox=postBox;
    }

    public void run(){
        String[] letters={"Letter1", "Letter2", "Letter3"};
        for(String letter:letters){
            try{
                Thread.sleep(1000);
                postBox.drop(letter);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
