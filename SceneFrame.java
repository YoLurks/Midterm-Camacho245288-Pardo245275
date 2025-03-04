import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

/**
SceneFrame is the main window for the animated scene.
**/
public class SceneFrame {
    private JFrame frame;
    private SceneCanvas scenecanvas;

    /**
        Constructor for SceneFrame that initializes the JFrame and SceneCanvas.
        @throws UnsupportedAudioFileException if the audio file format is not supported.
        @throws IOException if there is an error loading the audio files.
        @throws LineUnavailableException if the audio line cannot be opened.
    **/
    public SceneFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        frame = new JFrame();
        scenecanvas = new SceneCanvas(); // Initialize SceneCanvas to be displayed in the frame
    }

    /**
    Sets up the GUI for the scene frame.
    **/
    public void setUpGUI()  {
        frame.setTitle("Midterm Project - Camacho245288 - Pardo246268");
        frame.setLayout(new BorderLayout());
        frame.add(scenecanvas, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
