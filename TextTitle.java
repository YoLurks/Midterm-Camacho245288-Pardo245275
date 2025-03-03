import java.awt.*;
import java.util.ArrayList;
public class TextTitle extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    
    public TextTitle(){
        elements = new ArrayList<>();
        elements.add(new Text(334, 89, "ACCIDENTALLY", Color.BLACK,46, 0));
        elements.add(new Text(330, 86, "ACCIDENTALLY", new Color(255,252,240),46, 0));
        elements.add(new Text(330, 149, "IN LOVE", Color.BLACK,46, 0));
        elements.add(new Text(326, 145, "IN LOVE", new Color(255,252,240),46, 0));

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
