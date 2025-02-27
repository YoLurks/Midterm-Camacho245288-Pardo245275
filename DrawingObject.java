import java.awt.*;
public abstract class DrawingObject {
    
    private double x, y;
    
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

}
   

