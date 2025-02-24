import java.awt.*;
import java.awt.geom.*;
public class Square implements DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;
    private double rotation;

    public Square(double x,double y,double w,double h, Color color, double rotation){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.rotation = rotation;
    }
    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double circle = new Rectangle2D.Double(x,y,w,h);
       
        g2d.rotate(Math.toRadians(rotation), x, y);
        g2d.setColor(color);   
        g2d.fill(circle);

    }

        
}


