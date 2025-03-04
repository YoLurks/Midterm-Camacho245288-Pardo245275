import java.awt.*;
import java.awt.geom.*;

/**
 * The Square class represents a rectangle (or square) shape that can be drawn and manipulated.
 * It extends the DrawingObject class and provides functionality to rotate, move, and draw the square.
 */
public class Square extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;
    private double rotation;

    /**
     * Constructor for the Square class. Initializes the position, size, color, and rotation of the square.
     *
     * @param x The x-coordinate of the top-left corner of the square.
     * @param y The y-coordinate of the top-left corner of the square.
     * @param w The width of the square.
     * @param h The height of the square.
     * @param color The color of the square.
     * @param rotation The rotation angle (in degrees) of the square.
     */
    public Square(double x, double y, double w, double h, Color color, double rotation){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.rotation = rotation;
    }

    /**
     * Rotates the square by 10 degrees in the clockwise direction.
     */
    public void rotate() {
        rotation += 10;
    }

    /**
     * Moves the square 5 units to the right.
     */
    public void moveRight(){
        x += 5;
    }

    /**
     * Draws the square on the given Graphics2D object.
     * The square is rotated based on its current rotation angle.
     *
     * @param g The Graphics2D object used for drawing the square.
     */
    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;

        // Create a rectangle with the specified position and size
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, w, h);
        
        // Rotate the Graphics2D object around the square's top-left corner
        g2d.rotate(Math.toRadians(rotation), x, y);
        
        // Set the color and fill the square
        g2d.setColor(color);   
        g2d.fill(rectangle);
    }

    /**
     * Gets the current y-coordinate of the square.
     *
     * @return The y-coordinate of the square.
     */
    @Override
    public double getY() { 
        return y;
    }

    /**
     * Sets a new y-coordinate for the square.
     *
     * @param newY The new y-coordinate to set.
     */
    @Override
    public void setY(double newY) { 
        this.y = newY;
    }

    /**
     * Gets the current x-coordinate of the square.
     *
     * @return The x-coordinate of the square.
     */
    @Override
    public double getX(){
        return x;
    }

    /**
     * Sets a new x-coordinate for the square.
     *
     * @param newX The new x-coordinate to set.
     */
    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
