import java.awt.*;
import java.util.ArrayList;
public class FrontGrass implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public FrontGrass(){
        elements = new ArrayList<>();
        elements.add(new Circle(-120.9,477.2,659.4,282.5,new Color(126,217,87),0));
        elements.add(new Triangle(123.9,456.6,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(221.1,463.6,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(260.1,461.6,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(348.8,477.2,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(405.5,496.5,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(582.8,536.3,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(719.8,553.5,64.4,56.3,new Color(126,217,87), 0));






        elements.add(new Circle(295.3,553.5,659.4,282.5,new Color(126,217,87),0));
        elements.add(new Circle(-167.9,510.3,659.4,282.5,new Color(123,204,88),0));


        
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
