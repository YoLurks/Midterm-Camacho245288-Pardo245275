/**
	The TextTitle class represents the title "ACCIDENTALLY IN LOVE" consisting of multiple Text objects.
    It is where the title is drawn.

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

public class TextTitle extends DrawingObject {
    private ArrayList<DrawingObject> elements;  
    private double y;                           
    private double x;                           

    /**
        Constructor that creates a TextTitle with two layers of text for "ACCIDENTALLY IN LOVE" title.
    **/
    public TextTitle() {
        elements = new ArrayList<>();
        elements.add(new Text(334, 89, "ACCIDENTALLY", Color.BLACK, 46, 0));
        elements.add(new Text(330, 86, "ACCIDENTALLY", new Color(255, 252, 240), 46, 0));
        elements.add(new Text(330, 149, "IN LOVE", Color.BLACK, 46, 0));
        elements.add(new Text(326, 145, "IN LOVE", new Color(255, 252, 240), 46, 0));
    }

    /**
        Draws the TextTitle (both layers of text) onto the Graphics2D object.
        @param g The Graphics2D object used for rendering.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Loop through the elements and draw each text object
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        @return The Y coordinate of the TextTitle.
    **/
    @Override
    public double getY() {
        return y;
    }

    /**
        Sets the Y coordinate of the TextTitle.
        @param newY The new Y coordinate to set.
     */
    @Override
    public void setY(double newY) {
        this.y = newY;
    }

    /**
        Gets the X coordinate of the TextTitle.
        @return The X coordinate of the TextTitle.
    **/
    @Override
    public double getX() {
        return x;
    }

    /**
        Sets the X coordinate of the TextTitle.
        @param newX The new X coordinate to set.
    **/
    @Override
    public void setX(double newX) {
        this.x = newX;
    }
}
