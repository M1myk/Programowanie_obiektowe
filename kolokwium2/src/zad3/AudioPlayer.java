package zad3;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String trackName) {
        System.out.println("Playing: " + trackName);
    }

    @Override
    public void pouse() {
        System.out.println("Pouse audio");

    }

    @Override
    public String getCurrentTrack() {
        return "Trek 08";
    }
}
