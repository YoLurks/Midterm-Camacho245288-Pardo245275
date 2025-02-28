import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

public class FrontPlants extends DrawingObject {
    private ArrayList<DrawingObject> lines;   // Fixed stems
    private ArrayList<Circle> circles;        // Swaying flowers
    private double swayOffset; // Small horizontal movement
    private double swayAngle; // Angle used for sin function

    public FrontPlants() {
        lines = new ArrayList<>();
        circles = new ArrayList<>();

        lines.add(new Line(72.6, 477.3, 107.2, 775.6, new Color(107, 173, 78), 1));
        lines.add(new Line(108.4, 484.8, 108.4, 785, new Color(107, 173, 78), 1));
        lines.add(new Line(140.5, 468.6, 73.8, 761.3, new Color(107, 173, 78), 1));

        circles.add(new Circle(57.4, 429.8, 24.6, 73.4, new Color(240, 208, 80), -3.2));
        circles.add(new Circle(96.7, 454.4, 16.5, 44.6, new Color(240, 208, 80), -3.2));
        circles.add(new Circle(135.1, 447.1, 16.5, 44.6, new Color(240, 208, 80), 13.5));

        circles.add(new Circle(58.3, 425.7, 24.6, 73.4, new Color(255, 222, 89), -3.2));
        circles.add(new Circle(98.5, 448.3, 16.1, 47.9, new Color(255, 222, 89), -1.3));
        circles.add(new Circle(137.5, 441.5, 16.1, 47.9, new Color(255, 222, 89), 11.7));

        swayOffset = 0; 
        swayAngle = 0;
    }

    @Override
    public void draw(Graphics2D g) {
        for (DrawingObject line : lines) {
            line.draw(g);
        }

        for (Circle circle : circles) {
            Graphics2D g2d = (Graphics2D) g.create();
            
            AffineTransform at = new AffineTransform();
            at.translate(swayOffset, 0); 
            g2d.transform(at);
            circle.draw(g2d);
            g2d.dispose();
        }
    }

    public void updateSway() {
        swayOffset = Math.sin(Math.toRadians(swayAngle)) * 2;
        swayAngle += 3.5; 
        if (swayAngle >= 360) {
            swayAngle = 0; 
        }
    }
}
