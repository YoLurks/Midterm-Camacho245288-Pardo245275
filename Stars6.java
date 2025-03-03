import java.awt.*;
import java.util.ArrayList;
public class Stars6 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x,y;
    public Stars6(){
        elements = new ArrayList<>();
        elements.add(new Star(204.4, 78,30, 30, Color.WHITE));
        elements.add(new Star(705.9, 18,40, 40, Color.WHITE));
        elements.add(new Star(736.4, 370,40, 40, Color.WHITE));
        elements.add(new Star(15.3, 323,40, 40, Color.WHITE));  
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
