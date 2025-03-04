/**
	The Line class represents a line object with specified start and end points, color, and thickness.
    It is used to make the lines for the shed,vines, sign, and the flowers.

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
import java.awt.geom.*;

public class Line extends DrawingObject {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private Color color;
    private float thickness;

    /**
        Initializes the line with specified start and end points, color, and thickness.
        @param x1 the x-coordinate of the start point
        @param y1 the y-coordinate of the start point
        @param x2 the x-coordinate of the end point
        @param y2 the y-coordinate of the end point
        @param color the color of the line
        @param thickness the thickness of the line
    **/
    public Line(double x1, double y1, double x2, double y2, Color color, float thickness){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
        this.thickness = thickness;
    }

    /**
        Draws the line on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the line
    **/
    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(line);
    }

    /**
        Returns the Y-coordinate of the start point of the line.
    **/
    @Override
    public double getY() { 
        return y1;
    }
    
    /**
        Sets the Y-coordinate of the start point of the line.
        @param newY the new Y-coordinate for the start point
    **/
    @Override
    public void setY(double newY) { 
        this.y1 = newY; 
    }

    /**
        Returns the X-coordinate of the start point of the line.
    **/
    @Override
    public double getX(){
        return x1;
    }

    /**
        Sets the X-coordinate of the start point of the line.
        @param newX the new X-coordinate for the start point
    **/
    public void setX(double newX){
        this.x1 = newX;
    }
}
