import java.awt.*;
import java.util.ArrayList;

/**
    The Scanned class represents an invisible object (transparent) that will be the tracker that starts the stars animation.
**/
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
