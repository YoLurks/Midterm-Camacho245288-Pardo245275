/**
	The Stars2 class represents the first set of stars with a bigger size.

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


public class Stars2 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars2 class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates three larger stars and adds them to the `elements` list.
     */
    public Stars2() {
        elements = new ArrayList<>();
        // Adding larger stars with specific positions, sizes, and colors
        elements.add(new Star(26.9, 120, 26, 25, Color.WHITE)); // First larger star
        elements.add(new Star(724.8, 140, 35, 35, Color.WHITE)); // Second larger star
        elements.add(new Star(600.5, 295, 35, 35, Color.WHITE)); // Third larger star
    }

    /**
        Draws all the stars contained in the `elements` list on the given Graphics2D object.
        @param g The Graphics2D object used for drawing the stars.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
