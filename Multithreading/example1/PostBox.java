package Multithreading.example1;

public class PostBox {
    private String letter;
    private boolean hasLetter =false;

    public void drop(String letter){
        synchronized (this){
            while (hasLetter){
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
            this.letter=letter;
            hasLetter=true;
            System.out.println("Postman has dropped the letter:" +letter);

            notify();
        }
    }


    public String pick(){
        synchronized (this){
            while(!hasLetter){
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

            hasLetter=false;
            System.out.println("Owner has picked the letter:" +letter);
            notify();
            return letter;
        }
    }

}
