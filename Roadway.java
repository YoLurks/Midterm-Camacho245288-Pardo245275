import java.awt.*;
import java.util.ArrayList;

/**
    The Roadway class represents a roadway with circular elements that form part of the scene.
    It contains methods for drawing the roadway and getting/setting its position.
**/
public class Roadway extends DrawingObject {
    private ArrayList<DrawingObject> elements; // List of circle elements representing the roadway
    private double y; // Y-coordinate of the roadway
    private double x; // X-coordinate of the roadway

    /**
        Initializes the roadway with predefined positions and colors for the circular elements.
    **/
    public Roadway(){
        elements = new ArrayList<>();
        elements.add(new Circle(-62.4, 463.3, 691.2, 296.2, new Color(254, 238, 181), 0));
        elements.add(new Circle(357.2, 510.3, 659.4, 282.5, new Color(254, 238, 181), 0));     
    }

    /**
        Draws all the circular elements of the roadway on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the roadway circles
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        // Drawing each circle element for the roadway
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
        Returns the current Y-coordinate of the roadway.
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
        Sets the Y-coordinate of the roadway.
        @param newY the new Y-coordinate for the roadway
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
        Returns the current X-coordinate of the roadway.
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
        Sets the X-coordinate of the roadway.
        @param newX the new X-coordinate for the roadway
    **/
    public void setX(double newX){
        this.x = newX;
    }
}
