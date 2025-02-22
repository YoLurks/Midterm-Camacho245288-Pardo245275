import java.awt.*;
import java.util.ArrayList;
public class Trees implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public Trees(){
        elements = new ArrayList<>();
        elements.add(new Square(77.3,95.5,149.4,394.3,new Color(99,93,79), 0));
        elements.add(new Square(39.5,96.8,49.2,116.3,new Color(99,93,79), -68.3));
        elements.add(new Square(171.5,125.3,29.1,111,new Color(99,93,79), -122.1));
        elements.add(new Circle(-30, -47.1, 142.6, 142.6, new Color(99,145,79,255), 0));  
        elements.add(new Circle(56.9, -55.1, 142.6, 142.6, new Color(123,204,91,255), 0));
        elements.add(new Circle(173.2, -71.3, 142.6, 142.6, new Color(99,145,79,255),0));  
        elements.add(new Square(462.7,71.3,120,460.8,new Color(99,90,73,255),0));
        elements.add(new Circle(359.4,-63.3,205.5,162.6,new Color(99,145,79),0));
        elements.add(new Circle(489.5,-68.4,205.5,162.6,new Color(126,217,87),0));
        elements.add(new Circle(348.2,-0.1,57.6,45.5,new Color(99,145,79),0));
        elements.add(new Circle(399.5,71.8,57.6,45.5,new Color(99,145,79),0));
        elements.add(new Circle(497.3,26.7,76.9,60.8,new Color(126,217,87),0));
        elements.add(new Circle(597.9,45,76.9,60.8,new Color(126,217,87),0));
        elements.add(new Circle(641.7,-19.4,76.9,60.8,new Color(126,217,87),0));
        elements.add(new Square(779.7,-9.8,141.7,506,new Color(99,90,73,255),0));
        elements.add(new Square(-117.4,-9.8,149.4,480.5,new Color(99,90,73,255),0));
        elements.add(new Triangle(25.2,227.6,29.6,29.6,new Color(100,90,70), -141.1));
        elements.add(new Triangle(30.3,242.9,29.6,29.6,new Color(100,90,70), -141.1));
        elements.add(new Triangle(465.4,148.2,21.5,21.5,new Color(100,90,70), 48.4));
        elements.add(new Triangle(582.3,293.4,21.5,21.5,new Color(100,90,70), -136.9));
        elements.add(new Triangle(779.9,118.2,21.5,21.5,new Color(100,90,70), 35.9));
        elements.add(new Triangle(779.9,163.3,21.5,21.5,new Color(100,90,70), 35.9));
        elements.add(new Triangle(-131.8,394.4,203.3,177.9,new Color(100,90,70), -11.4));
        elements.add(new Triangle(536.1,440.2,64.4,56.3,new Color(100,90,70), 0));

















        
        
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
