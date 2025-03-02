import java.awt.*;
public abstract class DrawingObject {
    
    private double x, y, swayOffset, swayAngle;
    
    public abstract void draw(Graphics2D g);
    

    
    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    public void setSway(){
        swayOffset = Math.sin(Math.toRadians(swayAngle)) * 2;
        swayAngle += 3.5; 
        if (swayAngle >= 360) {
            swayAngle = 0; 
        }
    }
    }


   

