import java.awt.*;
import java.util.ArrayList;
public class FrontGrass extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
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
        
        elements.add(new Triangle(84.3,497.2,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Triangle(135,491.7,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Triangle(188.9,491.7,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Triangle(213.5,505.4,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Triangle(262.8,505.4,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Triangle(318.2,511.2,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Triangle(390.1,542.2,64.4,56.3,new Color(123,204,88),0));
        elements.add(new Circle(-167.9,510.3,659.4,282.5,new Color(123,204,88),0));  
    }

    @Override
    public void draw(Graphics2D g) {
    Graphics2D g2d = (Graphics2D) g;
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