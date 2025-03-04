import java.awt.*;
import java.util.ArrayList;

/**
The Sign class represents a sign with various graphical elements.
It extends the DrawingObject class and contains elements such as squares,
lines, triangles, and text that make up the visual components of the sign.
**/
public class Sign extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;

    /**
    Constructor for the Sign class. It initializes the elements that make up the sign.
    The sign consists of squares, triangles, lines, and text.
    **/
    public Sign(){
        elements = new ArrayList<>();
        elements.add(new Square(635.6,419.8,21.2,73.4,new Color(123,115,94), 0));
        elements.add(new Square(592.3,380.7,107.1,64.9,new Color(154,140,109), 0));
        elements.add(new Line(608.6,417.5,586,437.8,new Color(67,127,82), 2));
        elements.add(new Triangle(617.8,397.2,27.9,24.4,new Color(67,127,82), 164.9));
        elements.add(new Triangle(724.1,407.7,32,28,new Color(67,127,82), 102));
        elements.add(new Line(615.6,434.6,672.4,438.1,new Color(99,93,78), 4));
        elements.add(new Triangle(615,420.2,17.3,15.1,new Color(99,93,78), 30));
        elements.add(new Text(610, 417, "KNOCK!", new Color(192, 179, 153),21, 0));
    }

    /**
    Draws the Sign object on the given Graphics2D context with anti-aliasing enabled.
    @param g The Graphics2D object used for drawing the sign.
    **/
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
