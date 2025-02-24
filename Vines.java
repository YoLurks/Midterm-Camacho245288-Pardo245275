import java.awt.*;
import java.util.ArrayList;
public class Vines implements DrawingObject {
    private ArrayList<DrawingObject> elements;
    public Vines(){
        elements = new ArrayList<>();
        elements.add(new Line(305.9,232.3,958.6,186,new Color(123,175,101), 1));
        elements.add(new Triangle(407.9,248.1,26.6,23.2,new Color(123,175,101),176.1));
        elements.add(new Triangle(414.6,246.1,23.9,20.9,new Color(123,175,101),176.1));
        elements.add(new Triangle(464.5,267.9,13.4,46.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(475.4,257.3,13.4,37.7,new Color(123,175,101),176.1));
        elements.add(new Triangle(525.2,235.5,13.4,18.6,new Color(123,175,101),176.1));
        elements.add(new Triangle(592.7,221.2,5.7,9,new Color(123,175,101),176.1));
        elements.add(new Triangle(604.4,231.5,13.4,21.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(608.7,225,9.1,14.6,new Color(123,175,101),174.8));
        elements.add(new Triangle(647.2,216.4,5.6,9,new Color(123,175,101),174.8));
        elements.add(new Triangle(705.9,213.3,9.7,9,new Color(123,175,101),-180));
        elements.add(new Triangle(718.3,224,13.4,21.4,new Color(123,175,101),176.1));
        elements.add(new Triangle(802.3,215.2,13.4,18.6,new Color(123,175,101),-178.9));

        elements.add(new Line(402.1,470,969.8,170.1,new Color(99,145,79), 1));
        elements.add(new Triangle(541,407.2,10.5,9.3,new Color(99,145,79),153));
        elements.add(new Triangle(550.8,404.9,13.5,11.8,new Color(99,145,79),153));
        elements.add(new Triangle(633.4,357.6,10.5,9.3,new Color(99,145,79),153));
        elements.add(new Triangle(654.3,346.7,10.5,9.3,new Color(99,145,79),153));

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
