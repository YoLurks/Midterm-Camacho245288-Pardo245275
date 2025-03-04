import java.awt.*;
/**
    The DrawingObject class is an abstract base class for objects that can be drawn.
**/
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
