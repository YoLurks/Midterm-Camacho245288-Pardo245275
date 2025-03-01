import java.awt.*;
import java.util.ArrayList;
public class Stars extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    public Stars(){
        elements = new ArrayList<>();
        elements.add(new Star(26.9, 125,23.4, 20.5, Color.WHITE));
        elements.add(new Star(204.4, 81.8,23.4, 20.5, Color.WHITE));
        elements.add(new Star(705.9, 20.5,30.4, 29.3, Color.WHITE));
        elements.add(new Star(724.8, 148.6,30.5, 29.3, Color.WHITE));
        elements.add(new Star(600.5, 300,30.5, 29.3, Color.WHITE));
        elements.add(new Star(736.4, 375.6,30.5, 29.3, Color.WHITE));
        elements.add(new Star(15.3, 328.5,30.5, 29.3, Color.WHITE));
    }

    @Override
    public void draw(Graphics2D g) {
    Graphics2D g2d = (Graphics2D) g;
    for (DrawingObject obj : elements) {
        Graphics2D g2dC = (Graphics2D) g2d.create();
        obj.draw(g2dC);
        g2dC.dispose();
    }
}
    public void moveDown(double amount) {
        for (DrawingObject obj : elements) {
            obj.setY(obj.getY() + amount);
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
}
