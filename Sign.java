/**
	The Sign class represents the sign that will signify what to click/knock on.

	@author Lance Arnel G. Camacho (245288)
    @author John Jerome Pardo (246268)
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
import java.util.ArrayList;

public class Sign extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double y;
    private double x;

    /**
    Constructor for the Sign class. It initializes the elements that make up the sign.
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
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
