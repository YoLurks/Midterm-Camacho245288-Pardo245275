import java.awt.*;
import java.util.ArrayList;

/**
 * The Stars3 class represents a collection of even larger star shapes that can be drawn.
 * This class extends the DrawingObject class and uses the Star class to create individual star objects.
 * These stars are bigger than those in the Stars and Stars2 classes, enhancing the scene's visual effect.
 */
public class Stars3 extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars3 class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates three even larger stars and adds them to the `elements` list.
     */
    public Stars3() {
        elements = new ArrayList<>();
        // Adding even larger stars with specific positions, sizes, and colors
        elements.add(new Star(26.9, 120, 30, 30, Color.WHITE)); // First larger star
        elements.add(new Star(724.8, 145, 40, 40, Color.WHITE)); // Second larger star
        elements.add(new Star(600.5, 295, 40, 40, Color.WHITE)); // Third larger star
    }

    /**
     * Draws all the stars contained in the `elements` list on the given Graphics2D object.
     * It enables anti-aliasing for smoother rendering of the stars.
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
