import java.io.IOException;
import javax.sound.sampled.*;

/**
    The SceneStarter class is the entry point for the application.
    It initializes the SceneFrame and sets up the GUI.
**/
public class SceneStarter {

    /**
    The main method that creates a SceneFrame object and sets up its GUI.
    @param args Command-line arguments (not used in this program).
    @throws UnsupportedAudioFileException If the audio file format is unsupported.
    @throws IOException If an I/O error occurs while loading the audio file.
    @throws LineUnavailableException If an audio line cannot be opened.
    **/
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        SceneFrame frame = new SceneFrame();
        frame.setUpGUI();
    }
}
