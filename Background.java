import java.awt.*;
import java.awt.geom.*;
public class Background extends DrawingObject {
    private double x;
    private double x1;
    private double y;
    private double w;
    private double h;
    
    public Background(){
        x = 0;
        x1 = 800;
        y = 0;
        w = 800;
        h = 600;
    }

    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x,y,w,h);

        g.setColor(new Color(83,100,76));
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

    public void moveDown(double amount){
        this.y += amount;
        }

    public boolean containsPoint(int mouseX, int mouseY) {
        return (mouseX >= x1 && mouseX <= x1 + w) && (mouseY >= y && mouseY <= y + h);
    }
    }

