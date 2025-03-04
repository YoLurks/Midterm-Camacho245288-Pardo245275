/**
	The Text class represents a text object that can be drawn onto a canvas.
    It is a text that has a fixed font family but allows different values like color and size.

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

public class Text extends DrawingObject {
    private float x;         
    private float y;         
    private String s;        
    private int size;        
    private Color color;     
    private double rotation; 

    /**
        Constructor for creating a Text object with specific position, text, color, size, and rotation.
        @param x  x-coordinate
        @param y  y-coordinate
        @param s  string text  
        @param color color of the text  
        @param size  size of the text
     * @param rotation rotation on degrees
     */
    public Text(float x, float y, String s, Color color, int size, double rotation) {
        this.x = x;
        this.y = y;
        this.s = s;
        this.size = size;
        this.color = color;
        this.rotation = rotation;
    }

    /**
        Rotates the text by 10 degrees in the clockwise direction.
    **/
    public void rotate() {
        rotation += 10;
    }

    /**
        Draws the text string on the Graphics2D object, applying the specified rotation, color, and size.
        @param g The Graphics2D object used to render the text.
    **/
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;

        // Apply the rotation to the text at the specified coordinates
        g2d.rotate(Math.toRadians(rotation), x, y);

        // Set the font, size, and color for the text
        g2d.setFont(new Font("Chalkboard", Font.BOLD, size));
        g2d.setColor(color);

        // Draw the string at the specified coordinates
        g2d.drawString(s, x, y);
    }
}
