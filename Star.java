import java.awt.*;
import java.awt.geom.*;

public class Star extends DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;

    public Star(double x, double y, double w, double h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        Path2D star = new Path2D.Double();

        //middle upper
        double x1 = x + w / 2;
        double y1 = y;

        //left side
        double x2 = x + w / 4;
        double y2 = y + h / 4;

        double x3 = x;
        double y3 = y2;

        double x4 = x2;
        double y4 = y + h / 2;
        
        double x5 = x;
        double y5 = y + h * 7/8;

        //middle lower
        double x6 = x1;
        double h75 = h * 3/4;
        double y6 = y + h75;
        
        //right side 
        double x7 = x + w;
        double y7 = y + h * 7/8;

        double w75 = w * 3/4;
        double x8 = x + w75;
        double y8 = y4;

        double x9 = x + w;
        double y9 = y + h /4;
        
        double x10 = x8;
        double y10 = y9;
        
        // the ten points that are very skibidi
        star.moveTo(x1, y1);
        star.lineTo(x2, y2);
        star.lineTo(x3, y3);
        star.lineTo(x4, y4);
        star.lineTo(x5, y5);
        star.lineTo(x6, y6);
        star.lineTo(x7, y7);
        star.lineTo(x8, y8);
        star.lineTo(x9, y9);
        star.lineTo(x10, y10);

        star.closePath();
        g.setColor(color);
        g.fill(star);
    }

     @Override
    public double getY() { 
        return y;
    }
    
    @Override
    public void setY(double newY) { 
        this.y = newY; 
    }

    @Override
    public double getX(){
        return x;
    }

    @Override
    public void setX(double newX){
        this.x = newX;
    }
}
