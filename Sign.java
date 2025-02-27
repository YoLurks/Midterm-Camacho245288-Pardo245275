import java.awt.*;
import java.util.ArrayList;
public class Sign extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    public Sign(){
        elements = new ArrayList<>();
        elements.add(new Square(635.6,419.8,21.2,73.4,new Color(123,115,94), 0));
        elements.add(new Square(592.3,380.7,107.1,64.9,new Color(154,140,109), 0));
        elements.add(new Line(608.6,417.5,586,437.8,new Color(67,127,82), 2));
        elements.add(new Triangle(617.8,397.2,27.9,24.4,new Color(67,127,82), 164.9));
        elements.add(new Triangle(724.1,407.7,32,28,new Color(67,127,82), 102));
        elements.add(new Line(615.6,434.6,672.4,438.1,new Color(99,93,78), 4));
        elements.add(new Triangle(615,420.2,17.3,15.1,new Color(99,93,78), 30));

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
    @Override
    public double getY() { 
        return y ;
    }

    @Override
    public void setY(double newY) { 
        this.y = newY;
    }

    @Override
    public double getX(){
        return x;
    }

    @Override
    public void setX(double newX){
        this.x = newX;
    }

}
