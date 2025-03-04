/**
	The FrontGrass class represents the grass portion in front of the scene with multiple elements.
    It included an array of circles and triangles to draw the grass.

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

public class FrontGrass extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;

    /**
        Initializes the FrontGrass with various elements like circles and triangles.
    **/
    public FrontGrass(){
        elements = new ArrayList<>();
        elements.add(new Circle(-120.9, 477.2, 659.4, 282.5, new Color(126,217,87), 0));
        elements.add(new Triangle(123.9, 456.6, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Triangle(221.1, 463.6, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Triangle(260.1, 461.6, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Triangle(348.8, 477.2, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Triangle(405.5, 496.5, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Triangle(582.8, 536.3, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Triangle(719.8, 553.5, 64.4, 56.3, new Color(126,217,87), 0));
        elements.add(new Circle(295.3, 553.5, 659.4, 282.5, new Color(126,217,87), 0));

        elements.add(new Triangle(84.3, 497.2, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Triangle(135, 491.7, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Triangle(188.9, 491.7, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Triangle(213.5, 505.4, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Triangle(262.8, 505.4, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Triangle(318.2, 511.2, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Triangle(390.1, 542.2, 64.4, 56.3, new Color(123,204,88), 0));
        elements.add(new Circle(-167.9, 510.3, 659.4, 282.5, new Color(123,204,88), 0));  
    }

    /**
        Draws all the elements of the FrontGrass on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the elements
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        Returns the current Y-coordinate of the FrontGrass.
        @return the Y-coordinate of the FrontGrass
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
        Sets the Y-coordinate of the FrontGrass.
        @param newY the new Y-coordinate value
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate of the FrontGrass.
        @return the X-coordinate of the FrontGrass
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the X-coordinate of the FrontGrass.
        @param newX the new X-coordinate value
    **/
    public void setX(double newX){
        this.x = newX;
    }
}
