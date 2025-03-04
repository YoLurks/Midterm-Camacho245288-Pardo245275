/**
	The Scanned class represents an invisible object (transparent) that will be the tracker that starts the stars animation.

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

public class Scanned extends DrawingObject {
    private ArrayList<DrawingObject> elements; 
    private double y; 
    private double x; 
    private double width; 
    private double height; 

    /**
        Initializes the Scanned object with its size and position.
        @param x the x coordinate
        @param y the y coordinate
        @param w the width 
        @param h the height 
    **/
    public Scanned(double x, double y, double w, double h){
        elements = new ArrayList<>();
        elements.add(new Square(x, y, w, h, new Color(244, 250, 252, 0), 0));
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    /**
        Draws the Scanned object and its elements on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the elements
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        // Drawing each element (in this case, just the square)
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        Returns the current y coordinate.
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
        Sets the new y coordinate w/ the parameter's value
        @param newY the new y-coordinate
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate of the Scanned object.
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the X-coordinate of the Scanned object.
        @param newX the new X-coordinate for the Scanned object
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }

    /**
        Moves the Scanned object to the right by the specified amount.
        This will update the X-coordinate of all elements contained in the Scanned object.
        @param amount the amount to move the object to the right
    **/
    public void moveRight(double amount) {
        // Moving each element (square) in the Scanned object to the right by the specified amount
        for (DrawingObject obj : elements) {
            obj.setX(obj.getX() + amount);
        }
    }
}
