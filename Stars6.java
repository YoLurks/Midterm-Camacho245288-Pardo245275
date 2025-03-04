/**
	The Stars6 class represents the second set of stars with the biggest size.

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

import java.awt.*;
import java.util.ArrayList;

public class Stars6 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
        Constructor for the Stars6 class. Initializes the collection of stars with specific positions, sizes, and colors.
    **/
    public Stars6() {
        elements = new ArrayList<>();
        elements.add(new Star(204.4, 78, 30, 30, Color.WHITE));  // First star
        elements.add(new Star(705.9, 18, 40, 40, Color.WHITE));  // Second star
        elements.add(new Star(736.4, 370, 40, 40, Color.WHITE)); // Third star
        elements.add(new Star(15.3, 323, 40, 40, Color.WHITE));  // Fourth star
    }

    /**
        Draws all the stars contained in the `elements` list onto the given Graphics2D object, also including anti-aliasing.
        @param g The Graphics2D object used to draw the stars.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;       
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
