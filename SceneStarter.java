/**
	The SceneStarter class is the entry point that will start the animation. 
    It is where the code will be executed to show the graphics.

	@author Lance Arnel G. Camacho (245288)
    @author John Jerome C. Pardo (246268)
	@version March 5, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.io.IOException;
import javax.sound.sampled.*;

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
