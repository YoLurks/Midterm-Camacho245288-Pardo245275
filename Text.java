import java.awt.*;

/**
 * The Text class represents a text object that can be drawn onto a canvas. It includes properties for position, 
 * text content, font size, color, and rotation. The text is drawn on a given Graphics2D object.
 */
public class Text extends DrawingObject {
    private float x;         // X position of the text
    private float y;         // Y position of the text
    private String s;        // The text string to display
    private int size;        // Font size of the text
    private Color color;     // Color of the text
    private double rotation; // Rotation angle for the text

    /**
     * Constructor for creating a Text object with specific position, text, color, size, and rotation.
     *
     * @param x       The x-coordinate of the text.
     * @param y       The y-coordinate of the text.
     * @param s       The text string.
     * @param color   The color of the text.
     * @param size    The font size of the text.
     * @param rotation The rotation angle of the text (in degrees).
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
     * Rotates the text by 10 degrees in the clockwise direction.
     */
    public void rotate() {
        rotation += 10;
    }

    /**
     * Draws the text string on the Graphics2D object, applying the specified rotation, color, and size.
     * The text is rendered using the "Chalkboard" font in bold style.
     *
     * @param g The Graphics2D object used to render the text.
     */
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
