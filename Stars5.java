import java.awt.*;
import java.util.ArrayList;
public class Stars5 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x,y;
    public Stars5(){
        elements = new ArrayList<>();
        elements.add(new Star(204.4, 78,26, 25, Color.WHITE));
        elements.add(new Star(204.4, 78,26, 25, Color.WHITE));
        elements.add(new Star(705.9, 18,35, 35, Color.WHITE));
        elements.add(new Star(736.4, 372.6,35, 35, Color.WHITE));
        elements.add(new Star(15.3, 324.5,35, 35, Color.WHITE));
    }
        @Override
        public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }

    }


}