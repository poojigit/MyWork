package OpenClosed;

public class SDQuality implements VideoPlayer{
    @Override
    public void play(String quality) {
        System.out.println("The quality is:" +quality);
    }
}
