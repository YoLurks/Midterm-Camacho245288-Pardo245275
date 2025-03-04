/**
	The Roadway class represents the road between the grass, using circle classes.

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

public class Roadway extends DrawingObject {
    private ArrayList<DrawingObject> elements; // List of circle elements representing the roadway
    private double y; // Y-coordinate of the roadway
    private double x; // X-coordinate of the roadway

    /**
        Initializes the roadway with predefined positions and colors for the circular elements.
    **/
    public Roadway(){
        elements = new ArrayList<>();
        elements.add(new Circle(-62.4, 463.3, 691.2, 296.2, new Color(254, 238, 181), 0));
        elements.add(new Circle(357.2, 510.3, 659.4, 282.5, new Color(254, 238, 181), 0));     
    }

    /**
        Draws all the circular elements of the roadway on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the roadway circles
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        // Drawing each circle element for the roadway
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        Returns the current Y-coordinate of the roadway.
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
        Sets the Y-coordinate of the roadway.
        @param newY the new Y-coordinate for the roadway
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate of the roadway.
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the X-coordinate of the roadway.
        @param newX the new X-coordinate for the roadway
    **/
    public void setX(double newX){
        this.x = newX;
    }
}
