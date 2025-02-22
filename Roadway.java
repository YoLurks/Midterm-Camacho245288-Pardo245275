import java.awt.*;
import java.util.ArrayList;
public class Roadway implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public Roadway(){
        elements = new ArrayList<>();
        elements.add(new Circle(-62.4,463.3,691.2,296.2,new Color(254,238,181), 0));
        elements.add(new Circle(357.2,510.3,659.4,282.5,new Color(254,238,181), 0));


        
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
