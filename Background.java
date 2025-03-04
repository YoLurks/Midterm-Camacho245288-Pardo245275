/**
	The Background class represents the background of the scene with a rectangular shape.
    It included a rectangle that fills up the whole screen.

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

public class Background extends DrawingObject {
    private double x;
    private double x1;
    private double y;
    private double w;
    private double h;
    
    /**
        Initializes the background with default position and size.
    **/
    public Background(){
        x = 0;
        x1 = 800;
        y = 0;
        w = 800;
        h = 600;
    }

    /**
        Draws the background rectangle on the provided Graphics2D object.
        @param g is the Graphics2D object 
    **/
    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x,y,w,h);
        g.setColor(new Color(83,100,76));
        g.fill(background);
    }

    /**
        Returns the current Y-coordinate.
    **/
    @Override
    public double getY() { 
        return y;
    }
    
    /**
        Sets the Y-coordinate.
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate.
    **/
    @Override
    public double getX(){
        return x;
    }
    
    /**
        Sets the new x-coordinate
        @param newX will replace x
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }

    /**
        Moves the background down by the parameter amount.
        @param amount to be added to y
    **/
    public void moveDown(double amount){
        this.y += amount;
    }

    /**
        Checks if the mouse pointer is within the area
        @param mouseX the x-coordinate of pointer
        @param mouseY the y-coordinate of pointer
        @return true if the mouse pointer is within the area, false if not
    **/
    public boolean containsPoint(int mouseX, int mouseY) {
        return (mouseX >= x1 && mouseX <= x1 + w) && (mouseY >= y && mouseY <= y + h);
    }
}
