package OpenClosed;

public class HDQuality implements VideoPlayer{
    @Override
    public void play(String quality) {
        System.out.println("The quality is:" +quality);
    }
}
