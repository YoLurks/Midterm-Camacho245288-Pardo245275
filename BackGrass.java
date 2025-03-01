import java.awt.*;
import java.util.ArrayList;
public class BackGrass extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
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
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
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

    public void setX(double newX){
        this.x = newX;
    }
}