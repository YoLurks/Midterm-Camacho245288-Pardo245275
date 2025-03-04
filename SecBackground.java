import java.awt.*;
import java.awt.geom.*;

/**
Represents a background object with a linear gradient fill.
**/
public class SecBackground extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;

    /**
    Constructs a SecBackground object with default coordinates and size.
    **/
    public SecBackground(){
        x = 0;
        y = 0;
        w = 800;
        h = 600;
    }

    /**
    Draws the background using a linear gradient fill.
    The background is drawn with a gradient from the top-left to the bottom-right.
    @param g the Graphics2D object used for drawing
    **/
    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x, y, w, h);

        Point2D start = new Point2D.Float(0, 0);
        Point2D end = new Point2D.Float(800, 600);
        float[] dist = {0.2f, 1.0f};
        Color[] colors = {new Color(205, 255,216), new Color(148, 185, 255)};
        LinearGradientPaint p =
            new LinearGradientPaint(start, end, dist, colors);

        g.setPaint(p);
        g.fill(background);
    }

    /**
    Returns the current Y coordinate of the background.
    @return the Y coordinate of the background
    **/
    @Override
    public double getY() { 
        return y;
    }

    /**
    Sets a new Y coordinate for the background.
    @param newY the new Y coordinate to set
    **/
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
    Returns the current X coordinate of the background.
    @return the X coordinate of the background
    **/
    @Override
    public double getX(){
        return x;
    }

    /**
    Sets a new X coordinate for the background.
    @param newX the new X coordinate to set
    **/
    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
