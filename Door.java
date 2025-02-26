import java.awt.*;
import java.util.ArrayList;

public class Door implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    
    public Door(){
        elements = new ArrayList<>();
        elements.add(new Square(108.4,256.2,182.4,235.7,new Color(155,140,110), -7.8));
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
}
