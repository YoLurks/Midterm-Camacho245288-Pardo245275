/**
	The Mountains class is used to draw the mountains in the background from shape classes.
    It uses triangles to create the mountains.

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

public class Mountains extends DrawingObject {
    private ArrayList<DrawingObject> elements; // List of triangle elements representing the mountains
    private double y; // Y-coordinate of the mountains
    private double x; // X-coordinate of the mountains
    private double width; // Width of the mountain area
    private double height; // Height of the mountain area

    /**
        Initializes the mountains with predefined positions and colors.
    **/
    public Mountains(){
        elements = new ArrayList<>();
        x = -2;
        y = 0;
        width = 287;
        height = 251;

        // Adding triangle elements to the mountains
        elements.add(new Triangle(-115.5, 277.1, 287.1, 251.2, new Color(67, 127, 82), 0));
        elements.add(new Triangle(-61.2, 260.2, 287.1, 251.2, new Color(67, 127, 82), 0));
        elements.add(new Triangle(190.5, 235.4, 287.1, 251.2, new Color(67, 127, 82), 0));
        elements.add(new Triangle(284.6, 238.6, 287.1, 251.2, new Color(67, 127, 82), 0));
        elements.add(new Triangle(478.2, 270.6, 287.1, 251.2, new Color(67, 127, 82), 0));
        elements.add(new Triangle(603.1, 285.1, 287.1, 251.2, new Color(67, 127, 82), 0));  
    }

    /**
        Draws all the mountain triangles on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the mountain shapes
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        // Drawing each triangle element
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        Returns the current Y-coordinate of the mountains.
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
        Sets the Y-coordinate of the mountains.
        @param newY the new Y-coordinate for the mountains
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate of the mountains.
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the X-coordinate of the mountains.
        @param newX the new X-coordinate for the mountains
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }

    /**
        Moves the mountains to the right by the specified amount.
        @param amount the amount to move the mountains to the right
    **/
    public void moveRight(double amount) {
        for (DrawingObject obj : elements) {
            obj.setX(obj.getX() + amount);
        }
    }

    /**
        Checks if a point (such as the mouse cursor) is within the bounds of the mountains.
        @param mouseX the X-coordinate of the point to check
        @param mouseY the Y-coordinate of the point to check
        @return true if the point is within the mountain bounds, otherwise false
    **/
    public boolean containsPoint(int mouseX, int mouseY) {
        return (mouseX >= x && mouseX <= x + width) && (mouseY >= y && mouseY <= y + height);
    }
}
