/**
	The BackPlants class represents the plants on the grass behind the road.
	
	@author Lance Arnel G. Camacho (245288)
    @author John Jerome C. Pardo (246268)
	@version March 5, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

public class BackPlants extends DrawingObject {
    private ArrayList<DrawingObject> lines;   
    private ArrayList<Circle> circles;        
    private double swayOffset; 
    private double swayAngle; 

    /**
        Initializes the BackPlants with the line and circle objects
    **/
    public BackPlants() {
        lines = new ArrayList<>();
        circles = new ArrayList<>();

        lines.add(new Line(394.5, 363.1, 417.2, 559.7, new Color(107, 173, 78), 1));
        lines.add(new Line(418.1, 368, 418.1, 565.9, new Color(107, 173, 78), 1));
        lines.add(new Line(439.2, 357.4, 395.3, 550.3, new Color(107, 173, 78), 1));
        lines.add(new Line(453.8, 381.9, 476.6, 578.4, new Color(107, 173, 78), 1));
        lines.add(new Line(477.4, 386.8, 477.5, 584.6, new Color(107, 173, 78), 1));
        lines.add(new Line(487.9, 581.3, 495, 383.5, new Color(107, 173, 78), 1));

        circles.add(new Circle(385, 329.1, 16.2, 48.4, new Color(255, 222, 89), -3.2));
        circles.add(new Circle(411.5, 344, 10.6, 31.6, new Color(255, 222, 89), -1.3));
        circles.add(new Circle(437.2, 339.5, 10.6, 31.6, new Color(255, 222, 89), 11.7));
        circles.add(new Circle(444.4, 347.8, 16.2, 48.4, new Color(255, 222, 89), -3.2));
        circles.add(new Circle(470.9, 362.8, 10.6, 31.6, new Color(255, 222, 89), -1.3));
        circles.add(new Circle(489.7, 366.4, 10.6, 31.6, new Color(255, 222, 89), 0.9));

        swayOffset = 0;
        swayAngle = 0;
    }

    /**
        Draws the lines and circles for the background plants, with sway animation applied to the circles.
        @param g the Graphics2D object used for drawing the plants
    **/
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

    /**
        Updates the sway effect of the plants by adjusting the sway offset.
    **/
    public void updateSway() {
        swayOffset = Math.sin(Math.toRadians(swayAngle)) * 2; 
        swayAngle += 3.5; 
        if (swayAngle >= 360) {
            swayAngle = 0;
        }
    }
}
