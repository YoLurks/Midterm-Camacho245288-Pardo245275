import java.awt.*;
import java.awt.geom.AffineTransform;

public class Triangle extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;
    private double rotation;

    public Triangle(double x, double y, double w, double h, Color color, double rotation) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.rotation = rotation;
    }

    @Override
    public void draw(Graphics2D g) {
        int[] xPoints = {(int) x, (int) (x + w), (int) (x + w / 2)};
        int[] yPoints = {(int) (y + h), (int) (y + h), (int) y};
        Polygon triangle = new Polygon(xPoints, yPoints, 3);
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(rotation), x, y);
        Shape rotatedTriangle = transform.createTransformedShape(triangle);

        g.setColor(color);
        g.fill(rotatedTriangle);
    }

     @Override
    public double getY() { 
        return y;
    }
    
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    @Override
    public double getX(){
        return x;
    }

    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
