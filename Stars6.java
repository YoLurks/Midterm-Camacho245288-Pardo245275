import java.awt.*;
import java.util.ArrayList;

/**
 * The Stars6 class represents a collection of stars that can be drawn onto a scene. 
 * This class extends the DrawingObject class and uses the Star class to create individual star objects.
 * The stars are distributed at different positions and sizes across the screen.
 */
public class Stars6 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars6 class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates four stars with different sizes and positions and adds them to the `elements` list.
     */
    public Stars6() {
        elements = new ArrayList<>();
        
        // Adding stars at specific positions with size and color
        elements.add(new Star(204.4, 78, 30, 30, Color.WHITE));  // First star
        elements.add(new Star(705.9, 18, 40, 40, Color.WHITE));  // Second star
        elements.add(new Star(736.4, 370, 40, 40, Color.WHITE)); // Third star
        elements.add(new Star(15.3, 323, 40, 40, Color.WHITE));  // Fourth star
    }

    /**
     * Draws all the stars contained in the `elements` list onto the given Graphics2D object.
     * Anti-aliasing is enabled for smoother rendering of the stars.
     *
     * @param g The Graphics2D object used to draw the stars.
     */
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Enabling anti-aliasing for smoother rendering
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        // Iterating through each star and drawing it
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
