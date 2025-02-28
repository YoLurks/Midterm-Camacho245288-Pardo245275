import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas scenecanvas;
    


    public SceneFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        frame = new JFrame();
        scenecanvas = new SceneCanvas();
    }

    public void setUpGUI()  {
        
        frame.setTitle("Midterm Project - Camacho245288 - Pardo246268");
        frame.setLayout(new BorderLayout());
        frame.add(scenecanvas, BorderLayout.CENTER);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
