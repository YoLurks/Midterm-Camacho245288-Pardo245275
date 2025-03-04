import java.awt.*;
import java.util.ArrayList;

/**
 * The Stars2 class represents a collection of larger star shapes that can be drawn.
 * Similar to the Stars class, but with different sizes and positions for the stars.
 * This class extends DrawingObject and utilizes the Star class to create individual star objects.
 */
public class Stars2 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars2 class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates three larger stars and adds them to the `elements` list.
     */
    public Stars2() {
        elements = new ArrayList<>();
        // Adding larger stars with specific positions, sizes, and colors
        elements.add(new Star(26.9, 120, 26, 25, Color.WHITE)); // First larger star
        elements.add(new Star(724.8, 140, 35, 35, Color.WHITE)); // Second larger star
        elements.add(new Star(600.5, 295, 35, 35, Color.WHITE)); // Third larger star
    }

    /**
     * Draws all the stars contained in the `elements` list on the given Graphics2D object.
     * It sets anti-aliasing to improve the rendering quality of the stars.
     *
     * @param g The Graphics2D object used for drawing the stars.
     */
    @Override
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Enabling anti-aliasing for smoother rendering
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        // Drawing each star in the `elements` list
        for (DrawingObject obj : elements) {
            obj.draw(g2d);
        }
    }
}
