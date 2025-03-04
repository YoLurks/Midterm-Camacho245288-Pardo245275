/**
    The DrawingObject class is an abstract base class for objects that can be drawn.
	
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

public abstract class DrawingObject {
    private double x, y, swayOffset, swayAngle;
    
    /**
        Abstract method for drawing the object on a Graphics2D context.
        @param g the Graphics2D object used for drawing
    **/
    public abstract void draw(Graphics2D g);
    

    /**
        Returns the current Y-coordinate of the object.
        @return the Y-coordinate of the object
    **/
    public double getY(){
        return y;
    }


    /**
        Sets the Y-coordinate of the object.
        @param y the new Y-coordinate value
    **/
    public void setY(double y){
        this.y = y;
    }


    /**
        Returns the current X-coordinate of the object.
        @return the X-coordinate of the object
    **/
    public double getX(){
        return x;
    }

    
    /**
        Sets the X-coordinate of the object.
        @param x the new X-coordinate value
    **/
    public void setX(double x){
        this.x = x;
    }
}
