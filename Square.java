import java.awt.*;
import java.awt.geom.*;
public class Square extends DrawingObject {
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

    public void rotate() {
        rotation += 10;
    }

    public void moveRight(){
        x += 5;
    }
    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double circle = new Rectangle2D.Double(x,y,w,h);
       
        g2d.rotate(Math.toRadians(rotation), x, y);
        g2d.setColor(color);   
        g2d.fill(circle);

    }

    @Override
    public double getY() { 
        return y;}

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
        



