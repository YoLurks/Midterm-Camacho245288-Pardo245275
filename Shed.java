/**
	The Shed class represents a shed structure with elements from different shape classes.
    It uses Rectangles, Circles, Lines, and Triangles to create the complex shape.

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

public class Shed extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x;
    private double y;
    private double width;
    private double height;

    /**
        Constructor for the Shed class, initializing the elements. The coordinates and size are the door's, identifying its area for clicking.
    **/
    public Shed(){
        elements = new ArrayList<>();
        x = 147;
        y = 250;
        width = 145;
        height = 210;

        // Shed background
        elements.add(new Square(90.8,205.5,40.5,304.5,new Color(124,115,95), 0));
        elements.add(new Square(96.7,218.3,162.5,278.9,new Color(140,128,104), 0));
        elements.add(new Square(123.9,205.5,178.3,42.5,new Color(155,140,110), 0));
        elements.add(new Square(202.2,187.4,97.6,42.7,new Color(155,140,110), 0));

        elements.add(new Circle(156.1,218.3,139.6,75.8,new Color(70,79,66),0));
        elements.add(new Triangle(174.3,215.3,32.2,28.2,new Color (70,79,66), 0));
        elements.add(new Triangle(204.4,209.7,32.2,28.2,new Color(70,79,66), 0));
        elements.add(new Triangle(229.6,205.2,32.2,28.2,new Color(70,79,66), 0));
        elements.add(new Triangle(261.2,219.4,12.8,11.2,new Color(70,79,66), 0));

        // Shed body
        elements.add(new Square(108.4,256.2,182.4,235.7,new Color(155,140,110), -7.8));
        elements.add(new Triangle(199.6,267.8,32.2,28.2,new Color(70,79,66), 171.7));
        elements.add(new Triangle(219.3,264.1,32.2,28.2,new Color(70,79,66), 171.7));
        elements.add(new Triangle(270.8,258.4,32.2,28.2,new Color(70,79,66), 171.7));

        elements.add(new Line(232.9,233.4,233.5,256.2,new Color(70,79,66), 3));
        elements.add(new Line(265.4,232.3,266,255.2,new Color(70,79,66), 3));
        elements.add(new Line(270.4,228.7,271,251.5,new Color(70,79,66), 3));

        elements.add(new Circle(287.6,286.3,8.5,16.2,new Color(70,79,66),0));
        elements.add(new Circle(283.8,395.8,8.5,16.2,new Color(70,79,66),0));
        elements.add(new Line(254.9,260.7,253.2,463.6,new Color(70,79,66), 2));
        elements.add(new Line(182.6,270.1,188.2,478.8,new Color(70,79,66), 2));
        elements.add(new Line(164.9,395.2,164.9,470.7,new Color(70,79,66), 3));
        elements.add(new Circle(185,403.9,3.9,7.4,new Color(70,79,66),0));

        elements.add(new Triangle(207.4,442.3,77.7,68,new Color(70,79,66), -12.4));
        elements.add(new Triangle(185.1,441.5,49.2,49.1,new Color(70,79,66), 1.4));
        elements.add(new Triangle(249.7,449.7,32.2,28.2,new Color(70,79,66), -12.4));

        elements.add(new Circle(197,279.4,45.6,41.2,new Color(70,79,66),0));
        elements.add(new Circle(207.8,283.1,36.6,33.8,new Color(155,140,110),0));

        // Shed supports
        elements.add(new Square(294.7,180.9,18.8,289.8,new Color(167,151,119), 0));
        elements.add(new Square(111.8,212.9,37.5,304.5,new Color(167,151,119), 0));
        elements.add(new Square(255.6,206.7,13.3,56,new Color(167,151,119), -56.2));
        elements.add(new Square(256.1,188.5,13.3,18.3,new Color(167,151,119), 0));

        // Shed support rope
        elements.add(new Square(255.2, 206.9, 19.1, 3.1, new Color(192, 179, 153), -28.9));
        elements.add(new Square(289.6, 263.1, 29, 3.1, new Color(192, 179, 153), -28.9));
        elements.add(new Square(290.8, 286.3, 29, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(292.7, 298, 25.8, 5.1, new Color(192, 179, 153), -28.6));
        elements.add(new Square(289.6, 392.5, 29, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(292.7, 394, 29, 3.1, new Color(192, 179, 153), 37));
        elements.add(new Square(291.8, 411.8, 29, 3.1, new Color(192, 179, 153), -38.8));
        elements.add(new Square(288.8, 412, 29, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(289.3, 416.9, 29, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(108.7, 218.3, 44.6, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(108.4, 238.8, 44.6, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(110.5, 270.6, 40, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(110.5, 385.3, 40, 3.1, new Color(192, 179, 153), 0));
        elements.add(new Square(110.5, 390.3, 40, 3.1, new Color(192, 179, 153), 0));

        // Shed roof
        elements.add(new Square(61.3, 214.1, 296.1, 14.8, new Color(136, 124, 100), -9.3));
        elements.add(new Square(61.3, 213.7, 50.9, 15.2, new Color(109,102,90), -9.3));
        elements.add(new Square(78.3, 207.9, 276.8, 3.6, new Color(126, 217, 87), -9.3));
        elements.add(new Triangle(127.6, 224.3, 26.6, 23.2, new Color(126, 217, 87), 170.6));
        elements.add(new Triangle(133.4, 215.3, 18.4, 16.1, new Color(126, 217, 87), 170.6));
        elements.add(new Triangle(336.8, 189.3, 26.2, 23.2, new Color(126, 217, 87), 165.1));
        elements.add(new Triangle(357.2, 186.8, 26.6, 23.2, new Color(126, 217, 87), 170.6));
    }

    /**
    Draws the Shed object on the given Graphics2D context.
    
    @param g The Graphics2D object used for drawing the shed.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject obj : elements) {
            Graphics2D g2dC = (Graphics2D) g2d.create();
            obj.draw(g2dC);
            g2dC.dispose();
        }
    }

    /**
        Checks if the given point (mouseX, mouseY) is inside the boundaries of the door.
        @param mouseX The x-coordinate of the pointer
        @param mouseY The y-coordinate of the pointer
        @return true if the point is at the door of the shed, false otherwise.
    **/

    public boolean containsPoint(int mouseX, int mouseY) {
        return (mouseX >= x && mouseX <= x + width) && (mouseY >= y && mouseY <= y + height);
    }

    /**
        @return the y-coordinate of the shed.
    **/
    @Override
    public double getY() {
        return y;
    }

    /**
        Sets the new y-coordinate of the shed.
        @param newY The new y-coordinate of the shed's door.
    **/
    @Override
    public void setY(double newY) {
        this.y = newY;
    }

    /**
        @return the x-coordinate of the shed's door.
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the x-coordinate
        @param newX The new x-coordinate of the shed's door.
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
