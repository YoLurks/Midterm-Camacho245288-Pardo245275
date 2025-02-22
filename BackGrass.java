import java.awt.*;
import java.util.ArrayList;
public class BackGrass implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public BackGrass(){
        elements = new ArrayList<>();
        elements.add(new Circle(60.4,451.4,659.4,282.5,new Color(126,217,87), 0));
        elements.add(new Circle(405.5,477.2,659.4,282.5,new Color(126,217,87), 0));
        elements.add(new Triangle(271,438.4,28.8,25.2,new Color(126,217,87), 0));
        elements.add(new Triangle(289.6,444,22.4,19.6,new Color(126,217,87), 0));
        elements.add(new Triangle(304.4,437,27.5,26.4,new Color(126,217,87), 3.5));
        elements.add(new Triangle(304.4,437,27.5,26.4,new Color(126,217,87), 3.5));
        elements.add(new Triangle(324,438.1,28.8,25.2,new Color(126,217,87), 0));
        elements.add(new Triangle(405.5,412,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(459.3,428.4,64,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(497.3,433.4,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(536.1,440.2,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(633.4,449,64.4,56.3,new Color(126,217,87), 0));
        elements.add(new Triangle(703,440.2,64.4,56.3,new Color(126,217,87), 0));














        
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
