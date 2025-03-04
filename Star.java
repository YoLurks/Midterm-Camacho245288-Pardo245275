/**
	The Star class is a shape class used to represent the stars in the sky.

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

public class Star extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;

    /**
     * Constructor for the Star class. Initializes the position, size, and color of the star.
     *
     * @param x The x-coordinate of the top-left corner of the bounding box for the star.
     * @param y The y-coordinate of the top-left corner of the bounding box for the star.
     * @param w The width of the bounding box for the star.
     * @param h The height of the bounding box for the star.
     * @param color The color of the star.
     */
    public Star(double x, double y, double w, double h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    /**
     * Draws the star on the given Graphics2D object. 
     * The star is created by connecting multiple points calculated based on the x, y, width, and height values.
     *
     * @param g The Graphics2D object used for drawing the star.
     */
    @Override
    public void draw(Graphics2D g) {
        Path2D star = new Path2D.Double();

        // Coordinates for the points of the star based on the bounding box (x, y, w, h)
        
        // Middle upper point
        double x1 = x + w / 2;
        double y1 = y;

        // Left side
        double x2 = x + w / 4;
        double y2 = y + h / 4;

        double x3 = x;
        double y3 = y2;

        double x4 = x2;
        double y4 = y + h / 2;

        double x5 = x;
        double y5 = y + h * 7/8;

        // Middle lower point
        double x6 = x1;
        double h75 = h * 3/4;
        double y6 = y + h75;

        // Right side
        double x7 = x + w;
        double y7 = y + h * 7/8;

        double w75 = w * 3/4;
        double x8 = x + w75;
        double y8 = y4;

        double x9 = x + w;
        double y9 = y + h / 4;

        double x10 = x8;
        double y10 = y9;

        // Connect the points to form the star
        star.moveTo(x1, y1);
        star.lineTo(x2, y2);
        star.lineTo(x3, y3);
        star.lineTo(x4, y4);
        star.lineTo(x5, y5);
        star.lineTo(x6, y6);
        star.lineTo(x7, y7);
        star.lineTo(x8, y8);
        star.lineTo(x9, y9);
        star.lineTo(x10, y10);

        star.closePath();
        
        // Set the color and fill the star
        g.setColor(color);
        g.fill(star);
    }

    /**
     * Gets the current y-coordinate of the star.
     *
     * @return The y-coordinate of the star.
     */
    @Override
    public double getY() { 
        return y;
    }
    
    /**
     * Sets a new y-coordinate for the star.
     *
     * @param newY The new y-coordinate to set.
     */
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
     * Gets the current x-coordinate of the star.
     *
     * @return The x-coordinate of the star.
     */
    @Override
    public double getX(){
        return x;
    }

    /**
     * Sets a new x-coordinate for the star.
     *
     * @param newX The new x-coordinate to set.
     */
    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
