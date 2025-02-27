import java.awt.*;
import java.awt.geom.AffineTransform;

public class Star extends DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;
    private double rotation;

    public Star(double x, double y, double size, Color color, double rotation) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.rotation = rotation;
    }

    @Override
    public void draw(Graphics2D g) {
        int[] xPoints = new int[10];
        int[] yPoints = new int[10];
        double angle = Math.PI / 5;

        for (int i = 0; i < 10; i++) {
            double r = (i % 2 == 0) ? size : size / 2.5;
            xPoints[i] = (int) (x + r * Math.cos(i * 2 * angle - Math.PI / 2));
            yPoints[i] = (int) (y + r * Math.sin(i * 2 * angle - Math.PI / 2));
        }

        Polygon star = new Polygon(xPoints, yPoints, 10);

        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(rotation), x, y);
        Shape rotatedStar = transform.createTransformedShape(star);

        g.setColor(color);
        g.fill(rotatedStar);
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
