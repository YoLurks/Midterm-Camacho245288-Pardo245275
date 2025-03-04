/**
	The Stars4 class represents the second set of stars with the smallest size.

	@author Lance Arnel G. Camacho (245288)
    @author John Jerome Pardo (246268)
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

public class Stars4 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars4 class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates four stars with different sizes and adds them to the `elements` list.
     */
    public Stars4() {
        elements = new ArrayList<>();
        // Adding stars at various positions and sizes
        elements.add(new Star(204.4, 81.8, 23.4, 20.5, Color.WHITE)); // First star
        elements.add(new Star(705.9, 20.5, 30.4, 29.3, Color.WHITE)); // Second star
        elements.add(new Star(736.4, 375.6, 30.5, 29.3, Color.WHITE)); // Third star
        elements.add(new Star(15.3, 328.5, 30.5, 29.3, Color.WHITE)); // Fourth star
    }

    /**
     * Draws all the stars contained in the `elements` list on the given Graphics2D object.
     * Anti-aliasing is enabled for smoother rendering of the stars.
     *
     * @param g The Graphics2D object used for drawing the stars.
     */
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;

        
        // Drawing each star in the `elements` list
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
