package zad3;

public class TestMediaPlayer {
    public static void main(String[] args)
    {
        AudioPlayer ap = new AudioPlayer();
        ap.play("I love u baby");
        ap.pouse();
        ap.getCurrentTrack();

        VideoPlayer vp = new VideoPlayer();
        vp.play("How to learn Java");
        vp.pouse();
        vp.getCurrentTrack();
    }
}
