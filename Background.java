import java.awt.*;
import java.awt.geom.*;
public class Background implements DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    
    public Background(){
        x = 0;
        y = 0;
        w = 800;
        h = 600;
    }

    @Override
    public void draw(Graphics2D g){
        Rectangle2D.Double background = new Rectangle2D.Double(x,y,w,h);
        g.setColor(new Color(83,100,76));
        g.fill(background);
    }

}
