import java.awt.*;
import java.awt.geom.*;
public class Line extends DrawingObject {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private Color color;
    private float thickness;
    public Line(double x1, double y1, double x2, double y2, Color color, float thickness){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
        this.thickness = thickness;
    }

    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        Line2D.Double Line = new Line2D.Double(x1,y1,x2,y2);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(Line);
       
    }

    @Override
    public double getY() { 
        return y1;
    }
    
    @Override
    public void setY(double newY) { 
        this.y1 = newY; 
    }   

    @Override
    public double getX(){
        return x1;
    }

    public void setX(double newX){
        this.x1 = newX;
    }
}