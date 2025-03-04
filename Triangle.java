import java.awt.*;
import java.awt.geom.*;

public class Triangle extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;
    private double rotation;

    /**
     * Constructor to initialize the triangle with position, size, color, and rotation.
     * 
     * @param x the x-coordinate of the triangle's position.
     * @param y the y-coordinate of the triangle's position.
     * @param w the width of the triangle.
     * @param h the height of the triangle.
     * @param color the color of the triangle.
     * @param rotation the rotation of the triangle in degrees.
     */
    public Triangle(double x, double y, double w, double h, Color color, double rotation) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.rotation = rotation;
    }

    /**
     * Draws the rotated triangle on the given graphics context.
     * 
     * @param g the Graphics2D context to draw on.
     */
    @Override
    public void draw(Graphics2D g) {

        Path2D triangle = new Path2D.Double();   
        
        double x1 = x + w / 2;
        double y1 = y;

        double x2 = x;
        double y2 = y + h;

        double x3 = x + w;
        double y3 = y + h;

        triangle.moveTo(x1, y1);
        triangle.lineTo(x2, y2);
        triangle.lineTo(x3, y3);
        triangle.closePath();

        AffineTransform transform = new AffineTransform();
        
        transform.rotate(Math.toRadians(rotation), x, y);
        Shape rotatedTriangle = transform.createTransformedShape(triangle);
    
        g.setColor(color);
        g.fill(rotatedTriangle);
    }

    /**
     * Returns the y-coordinate of the triangle.
     * 
     * @return the y-coordinate of the triangle.
     */
    @Override
    public double getY() { 
        return y;
    }
    
    /**
     * Sets the y-coordinate of the triangle.
     * 
     * @param newY the new y-coordinate of the triangle.
     */
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    /**
     * Returns the x-coordinate of the triangle.
     * 
     * @return the x-coordinate of the triangle.
     */
    @Override
    public double getX(){
        return x;
    }

    /**
     * Sets the x-coordinate of the triangle.
     * 
     * @param newX the new x-coordinate of the triangle.
     */
    @Override
    public void setX(double newX){
        this.x = newX;
    }

    /**
     * Changes the color of the triangle.
     * 
     * @param newColor the new color of the triangle.
     */
    public void changeColor(Color newColor){
        this.color = newColor;
    }
}
