/**
	The Circle class represents a base circle shape that is used by other classes to draw.
	
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
import java.awt.geom.*;

public class Circle extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;
    private double rotation;

    /**
        Initializes a circle with position, size, and color
        @param x the x-coordinate of the circle
        @param y the y-coordinate of the circle
        @param w the width of the circle
        @param h the height of the circle
        @param color the color of the circle
        @param rotation the rotation angle of the circle in degrees
    **/
    public Circle(double x, double y, double w, double h, Color color, double rotation){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.rotation = rotation;
    }

    /**
        Draws the circle on the provided Graphics2D object with the specified rotation.
        @param g the Graphics2D object used for drawing the circle
    **/
    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, w, h);
        g2d.setColor(color);   
        g2d.rotate(Math.toRadians(rotation), x, y);
        g2d.fill(circle);
    }

    /**
        @return the y-coordinate of the circle
    **/
    @Override
    public double getY() { 
        return y;
    }
    
    /**
        Sets the Y-coordinate of the circle.
        @param newY the new Y-coordinate value
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate of the circle.
        @return the X-coordinate of the circle
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the X-coordinate of the circle.
        @param newX the new X-coordinate value
    **/
    public void setX(double newX){
        this.x = newX;
    }
}
