import java.awt.*;
import java.util.ArrayList;
public class Roadway extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;

    public Roadway(){
        elements = new ArrayList<>();
        elements.add(new Circle(-62.4,463.3,691.2,296.2,new Color(254,238,181), 0));
        elements.add(new Circle(357.2,510.3,659.4,282.5,new Color(254,238,181), 0));     
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

    public void setX(double newX){
        this.x = newX;
    }
}
