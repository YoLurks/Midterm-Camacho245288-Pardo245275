import java.awt.*;
import java.awt.geom.*;
public class Background implements DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    
    public Background(double x, double y, double w, double h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x,y,w,h);
        g.setColor(new Color(83,100,76));
        g.fill(background);
    }

}
