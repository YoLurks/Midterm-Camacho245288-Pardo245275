/**
	The Vines class represents the vines connecting to the shed, used by elements like Line and Triangle classes.

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

public class Vines extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;

    /**
        Constructor to initialize the vines with various drawing objects, like triangle and line classes.
    **/
    public Vines(){
        elements = new ArrayList<>();
        elements.add(new Line(305.9,232.3,958.6,186,new Color(123,175,101), 1));

        elements.add(new Triangle(407.9,248.1,26.6,23.2,new Color(123,175,101),176.1));
        elements.add(new Triangle(416.5,246.9,23.9,22,new Color(123,175,101),176.1));

        elements.add(new Triangle(464.5,267.9,13.4,46.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(475.4,257.3,13.4,37.7,new Color(123,175,101),176.1));

        elements.add(new Triangle(525.2,235.5,13.4,18.6,new Color(123,175,101),176.1));
        elements.add(new Triangle(592.7,221.2,5.6,9,new Color(123,175,101),176.1));

        elements.add(new Triangle(604.4,232.5,13.4,21.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(608.7,225,9.1,14.6,new Color(123,175,101),174.8));

        elements.add(new Triangle(647.2,216.4,5.6,9,new Color(123,175,101),174.8));
        elements.add(new Triangle(705.9,213.3,9.7,9,new Color(123,175,101),-180));

        elements.add(new Triangle(718.3,224,13.4,21.4,new Color(123,175,101),176.1));

        elements.add(new Triangle(802.3,216.2,13.4,18.6,new Color(123,175,101),176.1));

        elements.add(new Line(402.1,470,969.8,170.1,new Color(99,145,79), 1));

        elements.add(new Triangle(541,407.2,10.5,9.3,new Color(99,145,79),153));
        elements.add(new Triangle(550.8,404.9,13.5,11.8,new Color(99,145,79),153));
        elements.add(new Triangle(633.4,357.6,10.5,9.3,new Color(99,145,79),153));
        elements.add(new Triangle(654.3,346.7,10.5,9.3,new Color(99,145,79),153));
    }

    /**
        Draws all the elements (lines and triangles) of the vines.
        @param g the Graphics2D context to draw on.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        @return the y-coordinate of the vines.
    **/
    @Override
    public double getY() { 
        return y;
    }
    
    /**
        Sets the y-coordinate of the vines.
        @param newY the new y-coordinate of the vines.
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        @return the x-coordinate of the vines.
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the x-coordinate of the vines.
        @param newX the new x-coordinate of the vines.
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
