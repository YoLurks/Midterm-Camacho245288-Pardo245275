import java.awt.*;
import java.awt.geom.*;

/**
    The Line class represents a line object with specified start and end points, color, and thickness.
**/
public class Line extends DrawingObject {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private Color color;
    private float thickness;

    /**
        Initializes the line with specified start and end points, color, and thickness.
        @param x1 the x-coordinate of the start point
        @param y1 the y-coordinate of the start point
        @param x2 the x-coordinate of the end point
        @param y2 the y-coordinate of the end point
        @param color the color of the line
        @param thickness the thickness of the line
    **/
    public Line(double x1, double y1, double x2, double y2, Color color, float thickness){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
        this.thickness = thickness;
    }

    /**
        Draws the line on the provided Graphics2D object.
        @param g the Graphics2D object used for drawing the line
    **/
    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(line);
    }

    /**
        Returns the Y-coordinate of the start point of the line.
    **/
    @Override
    public double getY() { 
        return y1;
    }
    
    /**
        Sets the Y-coordinate of the start point of the line.
        @param newY the new Y-coordinate for the start point
    **/
    @Override
    public void setY(double newY) { 
        this.y1 = newY; 
    }

    /**
        Returns the X-coordinate of the start point of the line.
    **/
    @Override
    public double getX(){
        return x1;
    }

    /**
        Sets the X-coordinate of the start point of the line.
        @param newX the new X-coordinate for the start point
    **/
    public void setX(double newX){
        this.x1 = newX;
    }
}
