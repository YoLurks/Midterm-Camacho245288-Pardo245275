import java.awt.*;
import java.util.ArrayList;
public class TextTitle extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    
    public TextTitle(){
        elements = new ArrayList<>();
        elements.add(new Text(334, 90, "ACCIDENTALLY", Color.WHITE,50, 0));
        elements.add(new Text(334, 150, "IN LOVE", Color.WHITE,50, 0));

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

}
