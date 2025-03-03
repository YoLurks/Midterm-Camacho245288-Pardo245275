import java.awt.*;
import java.awt.geom.*;
public class SecBackground extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    
    public SecBackground(){
        x = 0;
        y = 0;
        w = 800;
        h = 600;
    }

    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x,y,w,h);

        Point2D start = new Point2D.Float(0, 0);
        Point2D end = new Point2D.Float(800, 600);
        float[] dist = {0.2f, 1.0f};
        Color[] colors = {new Color(205, 255,216), new Color(148, 185, 255)};
        LinearGradientPaint p =
            new LinearGradientPaint(start, end, dist, colors);

        g.setPaint(p);
        g.fill(background);
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
