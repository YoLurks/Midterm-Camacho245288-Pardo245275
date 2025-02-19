import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;

    public Circle(double x,double y,double w,double h, Color color){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }
    @Override
        public void draw(Graphics2D g){
            Graphics2D g2d = (Graphics2D) g;
            Ellipse2D.Double circle = new Ellipse2D.Double(x,y,w,h);
            g2d.setColor(color);   
            g2d.fill(circle);

        }

        
}
