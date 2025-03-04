import java.awt.*;
import java.util.ArrayList;

/**
 * The TextTitle class represents the title "ACCIDENTALLY IN LOVE" consisting of multiple Text objects. 
 * The text has two layers, one black and one light-colored, to create a shadow effect.
 */
public class TextTitle extends DrawingObject {
    private ArrayList<DrawingObject> elements;  // List to store the Text elements (both black and light-colored text)
    private double y;                           // Y-coordinate of the TextTitle
    private double x;                           // X-coordinate of the TextTitle

    /**
     * Constructor that creates a TextTitle with two layers of text for "ACCIDENTALLY IN LOVE" title.
     */
    public TextTitle() {
        elements = new ArrayList<>();
        
        // Create the black and light-colored text for "ACCIDENTALLY"
        elements.add(new Text(334, 89, "ACCIDENTALLY", Color.BLACK, 46, 0));
        elements.add(new Text(330, 86, "ACCIDENTALLY", new Color(255, 252, 240), 46, 0));
        
        // Create the black and light-colored text for "IN LOVE"
        elements.add(new Text(330, 149, "IN LOVE", Color.BLACK, 46, 0));
        elements.add(new Text(326, 145, "IN LOVE", new Color(255, 252, 240), 46, 0));
    }

    /**
     * Draws the TextTitle (both layers of text) onto the Graphics2D object.
     * This method calls the draw method of each individual Text object in the elements list.
     * 
     * @param g The Graphics2D object used for rendering.
     */
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Loop through the elements and draw each text object
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }

    /**
     * Gets the Y coordinate of the TextTitle.
     * 
     * @return The Y coordinate of the TextTitle.
     */
    @Override
    public double getY() {
        return y;
    }

    /**
     * Sets the Y coordinate of the TextTitle.
     * 
     * @param newY The new Y coordinate to set.
     */
    @Override
    public void setY(double newY) {
        this.y = newY;
    }

    /**
     * Gets the X coordinate of the TextTitle.
     * 
     * @return The X coordinate of the TextTitle.
     */
    @Override
    public double getX() {
        return x;
    }

    /**
     * Sets the X coordinate of the TextTitle.
     * 
     * @param newX The new X coordinate to set.
     */
    @Override
    public void setX(double newX) {
        this.x = newX;
    }
}
