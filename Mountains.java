import java.awt.*;
import java.util.ArrayList;
public class Mountains implements DrawingObject {
    private ArrayList<DrawingObject> elements;
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
        Graphics2D g2dC = (Graphics2D) g2d.create();
        obj.draw(g2dC);
        g2dC.dispose();
    }
}

}
