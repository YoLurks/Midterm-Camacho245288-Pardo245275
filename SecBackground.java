/**
	The SecBackground is used as the next background once the first background leaves through a Timer.

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

public class SecBackground extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;

    /**
        Constructs a SecBackground object with size and position.
    **/
    public SecBackground(){
        x = 0;
        y = 0;
        w = 800;
        h = 600;
    }

    /**
        Draws the background using a linear gradient fill.
        The background is drawn with a gradient from the top-left to the bottom-right.
        @param g the Graphics2D object used for drawing
    **/
    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x, y, w, h);

        Point2D start = new Point2D.Float(0, 0);
        Point2D end = new Point2D.Float(800, 600);
        float[] dist = {0.2f, 1.0f};
        Color[] colors = {new Color(205, 255,216), new Color(148, 185, 255)};
        LinearGradientPaint p =
            new LinearGradientPaint(start, end, dist, colors);

        g.setPaint(p);
        g.fill(background);
    }

    /**
        @return the Y coordinate of the background
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
        Sets a new Y coordinate for the background.
        @param newY the new Y coordinate to set
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        @return the X coordinate of the background
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets a new x coordinate for the background.
        @param newX the new X coordinate to set
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
