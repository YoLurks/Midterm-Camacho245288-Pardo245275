import java.awt.*;
import java.util.ArrayList;
public class Scanned extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    private double width;
    private double height;
    public Scanned(double x, double y, double w, double h){
        elements = new ArrayList<>();
        elements.add(new Square(x,y,w,h,new Color(244,250,252, 0),0));
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw(Graphics2D g) {
    Graphics2D g2d = (Graphics2D) g;
    for (DrawingObject obj : elements) {
        obj.draw(g2d);
    }
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

    
    public void moveRight(double amount) {
        for (DrawingObject obj : elements) {
            obj.setX(obj.getX() + amount);
        }
    }

}
