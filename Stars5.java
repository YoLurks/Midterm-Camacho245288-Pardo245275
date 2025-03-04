/**
	The Stars5 class represents the second set of stars with a bigger size.
    It is where the star has a different value for an animatiom.

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


public class Stars5 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars5 class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates five stars with different sizes and positions and adds them to the `elements` list.
     */
    public Stars5() {
        elements = new ArrayList<>();
        
        // Adding stars at specific positions with size and color
        elements.add(new Star(204.4, 78, 26, 25, Color.WHITE)); // First star
        elements.add(new Star(204.4, 78, 26, 25, Color.WHITE)); // Second star (duplicate of the first)
        elements.add(new Star(705.9, 18, 35, 35, Color.WHITE)); // Third star
        elements.add(new Star(736.4, 372.6, 35, 35, Color.WHITE)); // Fourth star
        elements.add(new Star(15.3, 324.5, 35, 35, Color.WHITE)); // Fifth star
    }

    /**
     * Draws all the stars contained in the `elements` list onto the given Graphics2D object.
     * Anti-aliasing is enabled for smoother rendering of the stars.
     *
     * @param g The Graphics2D object used to draw the stars.
     */
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Iterating through each star and drawing it
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
