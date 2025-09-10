package OpenClosed.example1;

public class SDQuality implements VideoPlayer {
    @Override
    public void play(String quality) {

        System.out.println("The quality is:" +quality);
    }
}
