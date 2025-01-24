package zad3;

public class VideoPlayer implements MediaPlayer {

    @Override
    public void play(String trackName) {
        System.out.println("Playing: " + trackName);

    }

    @Override
    public void pouse() {
        System.out.println("Pouse video");

    }

    @Override
    public String getCurrentTrack() {
        return "Video 05";
    }
}
