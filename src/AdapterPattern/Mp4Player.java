package AdapterPattern;

/**
 * Created by Bogust on 26-6-2016.
 */
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:"+ fileName);
    }
}
