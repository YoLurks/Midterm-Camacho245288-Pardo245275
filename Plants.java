import java.awt.*;
import java.util.ArrayList;
public class Plants implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public Plants(){
        elements = new ArrayList<>();
        elements.add(new Circle(385,329.1,16.2,48.4,new Color(255,222,89), -3.2));
        elements.add(new Circle(411.5,344,10.6,31.6,new Color(255,222,89), -1.3));
        elements.add(new Circle(437.2,339.5,10.6,31.6,new Color(255,222,89), 11.7));
        elements.add(new Circle(444.4,347.8,16.2,48.4,new Color(255,222,89), -3.2));
        elements.add(new Circle(470.9,362.8,10.6,31.6,new Color(255,222,89), -1.3));
        elements.add(new Circle(489.7,366.4,10.6,31.6,new Color(255,222,89), 0.9));
        elements.add(new Circle(58.3,425.7,24.6,73.4,new Color(255,222,89), -3.2));
        elements.add(new Circle(98.5,448.3,16.1,47.9,new Color(255,222,89), -1.3));
        elements.add(new Circle(137.5,441.5,16.1,47.9,new Color(255,222,89), 11.7));









        
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
