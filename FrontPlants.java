import java.awt.*;
import java.util.ArrayList;
public class FrontPlants implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public FrontPlants(){
        elements = new ArrayList<>();
        elements.add(new Line(72.6,477.3,107.2,775.6,new Color(107,173,78), 1));
        elements.add(new Line(108.4,484.8,108.4,785,new Color(107,173,78), 1));
        elements.add(new Line(140.5,468.6,73.8,761.3,new Color(107,173,78), 1));

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
