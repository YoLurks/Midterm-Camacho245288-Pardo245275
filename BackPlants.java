import java.awt.*;
import java.util.ArrayList;
public class BackPlants extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    public BackPlants(){
        elements = new ArrayList<>();
        elements.add(new Line(394.5,363.1,417.2,559.7,new Color(107,173,78), 1));
        elements.add(new Line(418.1,368,418.1,565.9,new Color(107,173,78), 1));
        elements.add(new Line(439.2,357.4,395.3,550.3,new Color(107,173,78), 1));
        elements.add(new Line(453.8,381.9,476.6,578.4,new Color(107,173,78), 1));
        elements.add(new Line(477.4,386.8,477.5,584.6,new Color(107,173,78), 1));
        elements.add(new Line(487.9,581.3,495,383.5,new Color(107,173,78), 1));

        elements.add(new Circle(385,329.1,16.2,48.4,new Color(255,222,89), -3.2));
        elements.add(new Circle(411.5,344,10.6,31.6,new Color(255,222,89), -1.3));
        elements.add(new Circle(437.2,339.5,10.6,31.6,new Color(255,222,89), 11.7));
        elements.add(new Circle(444.4,347.8,16.2,48.4,new Color(255,222,89), -3.2));
        elements.add(new Circle(470.9,362.8,10.6,31.6,new Color(255,222,89), -1.3));
        elements.add(new Circle(489.7,366.4,10.6,31.6,new Color(255,222,89), 0.9));
        
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