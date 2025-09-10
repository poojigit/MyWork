package OpenClosed.example2;

import OpenClosed.example1.HDQuality;
import OpenClosed.example1.SDQuality;
import OpenClosed.example1.VideoPlayerService;

public class Main {


    public static void main(String[] args) {
        VideoPlayerService videoPlayerService=new VideoPlayerService();
        videoPlayerService.play(new SDQuality(),"SD");
        videoPlayerService.play(new HDQuality(),"HD");
    }
}
