import java.awt.*;
import java.awt.geom.*;

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

    public void changeColor(Color newColor){
        this.color = newColor;
    }
}
