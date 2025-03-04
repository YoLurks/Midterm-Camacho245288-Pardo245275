import java.awt.*;
import java.util.ArrayList;

/**
 * The Stars class represents a collection of star shapes that can be drawn.
 * It contains multiple stars and is responsible for rendering all of them on a Graphics2D object.
 * This class extends DrawingObject and utilizes the Star class to create individual star objects.
 */
public class Stars extends DrawingObject {
    private ArrayList<DrawingObject> elements;
    private double x, y;

    /**
     * Constructor for the Stars class. Initializes the collection of stars with specific positions, sizes, and colors.
     * It creates three star objects and adds them to the `elements` list.
     */
    public Stars() {
        elements = new ArrayList<>();
        // Adding stars with specific positions, sizes, and colors
        elements.add(new Star(26.9, 125, 23.4, 20.5, Color.WHITE)); // First star
        elements.add(new Star(724.8, 148.6, 30.5, 29.3, Color.WHITE)); // Second star
        elements.add(new Star(600.5, 300, 30.5, 29.3, Color.WHITE)); // Third star
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
