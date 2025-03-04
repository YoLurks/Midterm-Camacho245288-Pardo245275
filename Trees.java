/**
	The Trees class represents a drawing of multiple tree elements such as trunks, branches, and foliage.
    It creates more depth to the first background.

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

public class Trees extends DrawingObject {
    private ArrayList<DrawingObject> elements;  
    private double y;                           
    private double x;                           

    /**
        Constructor that initializes and adds multiple tree components (trunks, circles for foliage, branches, etc.)
        to the elements list to represent the trees.
    **/
    public Trees(){
        elements = new ArrayList<>();


        elements.add(new Square(77.3, 95.5, 149.4, 394.3, new Color(79, 73, 62), 0));  // Trunk
        elements.add(new Square(39.5, 96.8, 49.2, 116.3, new Color(79, 73, 62), -68.3));  // Left branch base
        elements.add(new Square(171.5, 125.3, 29.1, 111, new Color(79, 73, 62), -122.1));  // Right branch base
        elements.add(new Circle(-30, -47.1, 142.6, 142.6, new Color(99, 145, 79, 255), 0));  // Left foliage
        elements.add(new Circle(56.9, -55.1, 142.6, 142.6, new Color(85, 109, 75, 255), 0));  // Middle foliage
        elements.add(new Circle(173.2, -71.3, 142.6, 142.6, new Color(99, 145, 79, 255), 0));  // Right foliage
        elements.add(new Triangle(536.9, 416.9, 79.1, 82, new Color(99, 90, 73), 2.3));  // Main branch
        elements.add(new Square(462.7, 71.3, 120, 460.8, new Color(105, 98, 85, 255), 0));  // Another trunk part
        elements.add(new Circle(359.4, -63.3, 205.5, 162.6, new Color(93, 124, 79), 0));  // Left foliage circle
        elements.add(new Circle(489.5, -68.4, 205.5, 162.6, new Color(123, 181, 98), 0));  // Middle foliage circle
        elements.add(new Circle(348.2, -0.1, 57.6, 45.5, new Color(93, 124, 79), 0));  // Small left foliage circle
        elements.add(new Circle(399.5, 71.8, 57.6, 45.5, new Color(93, 124, 79), 0));  // Small middle foliage circle
        elements.add(new Circle(497.3, 26.7, 76.9, 60.8, new Color(123, 181, 98), 0));  // Small right foliage circle
        elements.add(new Circle(597.9, 45, 76.9, 60.8, new Color(123, 181, 98), 0));  // Another small foliage circle
        elements.add(new Circle(641.7, -19.4, 76.9, 60.8, new Color(123, 181, 98), 0));  // Another small foliage circle
        elements.add(new Square(779.7, -9.8, 141.7, 506, new Color(99, 90, 73, 255), 0));  // Right trunk
        elements.add(new Square(-117.4, -9.8, 149.4, 480.5, new Color(99, 90, 73, 255), 0));  // Left trunk
        elements.add(new Triangle(25.2, 227.6, 29.6, 29.6, new Color(100, 90, 70), -141.1));  // Left foliage branch
        elements.add(new Triangle(30.3, 242.9, 29.6, 29.6, new Color(100, 90, 70), -141.1));  // Left foliage branch
        elements.add(new Triangle(465.4, 148.2, 21.5, 21.5, new Color(99, 93, 78), 48.4));  // Right foliage branch
        elements.add(new Triangle(582.3, 293.4, 21.5, 21.5, new Color(109, 102, 90), -136.9));  // Right foliage branch
        elements.add(new Triangle(779.9, 118.2, 21.5, 21.5, new Color(100, 90, 70), 35.9));  // Right foliage branch
        elements.add(new Triangle(779.9, 163.3, 21.5, 21.5, new Color(100, 90, 70), 35.9));  // Right foliage branch
        elements.add(new Triangle(-131.8, 394.4, 203.3, 177.9, new Color(100, 90, 70), -11.4));  // Large foliage branch
        elements.add(new Triangle(536.1, 440.2, 64.4, 56.3, new Color(100, 90, 70), 0));  // Bottom foliage branch
    }

    /**
        Draws all the elements of the tree by iterating over each element and calling its draw method.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        // Loop through all elements and draw them
        for (DrawingObject obj : elements) {
            Graphics2D g2dC = (Graphics2D) g2d.create();  // Create a new Graphics2D object for each element
            obj.draw(g2dC);  // Draw the element
            g2dC.dispose();  // Dispose of the temporary Graphics2D object
        }
    }

    /**
        Moves all elements of the tree down by a specified amount.
        @param amount The amount by which to move the tree down.
    **/
    public void moveDown(double amount) {
        for (DrawingObject obj : elements) {
            obj.setY(obj.getY() + amount);  
        }
    }

    /**  
        @return The Y coordinate of the Trees.
    **/
    @Override
    public double getY() {
        return y;
    }

    /**
        Sets the Y coordinate of the Trees.
        @param newY The new Y coordinate to set.
    **/
    @Override
    public void setY(double newY) {
        this.y = newY;
    }

    /**
        @return The X coordinate of the Trees.
    **/
    @Override
    public double getX() {
        return x;
    }

    /**
        Sets the X coordinate of the Trees. 
        @param newX The new X coordinate to set.
    **/
    @Override
    public void setX(double newX) {
        this.x = newX;
    }
}
