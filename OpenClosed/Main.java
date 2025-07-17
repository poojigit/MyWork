package OpenClosed;

public class Main {


    public static void main(String[] args) {
        VideoPlayerService videoPlayerService=new VideoPlayerService();
        videoPlayerService.play(new SDQuality(),"SD");
        videoPlayerService.play(new HDQuality(),"HD");
    }
}
