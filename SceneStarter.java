import java.io.IOException;
import javax.sound.sampled.*;

public class SceneStarter   {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        SceneFrame f = new SceneFrame();
        f.setUpGUI();
    }
}   