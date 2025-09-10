package InterviewPrep.Inheritence;

public class Dog  extends Animal {
    void bark(){

        System.out.println("Dogs are barking");
    }

    @Override
    public void sound(){
        System.out.println("Dogs make sound by barking");
    }
}
