import java.awt.*;
import java.util.ArrayList;
public class Mountains extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    public Mountains(){
        elements = new ArrayList<>();
        elements.add(new Triangle(-115.5,277.1,287.1,251.2,new Color(67,127,82), 0));
        elements.add(new Triangle(-61.2,260.2,287.1,251.2,new Color(67,127,82), 0));
        elements.add(new Triangle(190.5,215.4,287.1,251.2,new Color(67,127,82), 0));
        elements.add(new Triangle(284.6,238.6,287.1,251.2,new Color(67,127,82), 0));
        elements.add(new Triangle(478.2,270.6,287.1,251.2,new Color(67,127,82), 0));
        elements.add(new Triangle(603.1,285.1,287.1,251.2,new Color(67,127,82), 0));  
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
