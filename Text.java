import java.awt.*;

public class Text extends DrawingObject {
    private float x;
    private float y;
    private String s;
    private int size;
    private Color color;
    private double rotation;

    public Text(float x, float y, String s, Color color, int size,double rotation){
        this.x = x;
        this.y = y;
        this.s = s;
        this.size = size;
        this.color = color;
        this.rotation = rotation;
    }

    public void rotate() {
        rotation += 10;
    }

    @Override
    public void draw(Graphics2D g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.rotate(Math.toRadians(rotation), x, y);
        g2d.setFont(new Font("HelveticaNeue",Font.BOLD , size));
        g2d.setColor(color);
        g2d.drawString(s, x, y);

    }
}
