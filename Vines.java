import java.awt.*;
import java.util.ArrayList;
public class Vines extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;
    public Vines(){
        elements = new ArrayList<>();
        elements.add(new Line(305.9,232.3,958.6,186,new Color(123,175,101), 1));

        elements.add(new Triangle(407.9,216.1,26.6,23.2,new Color(123,175,101),176.1));
        elements.add(new Triangle(414.6,216.1,23.9,20.9,new Color(123,175,101),176.1));

        elements.add(new Triangle(464.5,204.9,13.4,46.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(475.4,207.3,13.4,37.7,new Color(123,175,101),176.1));

        elements.add(new Triangle(525.2,210.5,13.4,18.6,new Color(123,175,101),176.1));
        elements.add(new Triangle(592.7,209.2,5.7,9,new Color(123,175,101),176.1));

        elements.add(new Triangle(604.4,202.5,13.4,21.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(608.7,204.5,9.1,14.6,new Color(123,175,101),174.8));

        elements.add(new Triangle(647.2,204.4,5.6,9,new Color(123,175,101),174.8));
        elements.add(new Triangle(705.9,200.3,9.7,9,new Color(123,175,101),-180));

        elements.add(new Triangle(718.3,196,13.4,21.4,new Color(123,175,101),176.1));

        elements.add(new Line(402.1,470,969.8,170.1,new Color(99,145,79), 1));
        elements.add(new Triangle(541,390.2,10.5,9.3,new Color(99,145,79),153));
        elements.add(new Triangle(550.8,383.9,13.5,11.8,new Color(99,145,79),153));
        elements.add(new Triangle(678.4,317.6,10.5,9.3,new Color(99,145,79),153));
        elements.add(new Triangle(684.3,314.7,10.5,9.3,new Color(99,145,79),153));

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

    @Override
    public void setX(double newX){
        this.x = newX;
    }

}
