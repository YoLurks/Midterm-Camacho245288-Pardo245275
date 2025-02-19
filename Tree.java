import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.List;
public class Tree implements DrawingObject {
 
    private double x;
    private double y;
    private double w;
    private double h;
    private Color trunkColor;
    private List<Circle> leaves; 

    public Tree(double x, double y, double w, double h, Color trunkColor, Color leafColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.trunkColor = trunkColor;
        this.leaves = new ArrayList<>();

        
        generateLeaves(leafColor);
    }

    private void generateLeaves(Color leafColor) {
     
        leaves.add(new Circle(x - 20, y - 50, 40, 40, leafColor));
        leaves.add(new Circle(x, y - 60, 40, 40, leafColor));
        leaves.add(new Circle(x + 20, y - 50, 40, 40, leafColor));
    }

    @Override
    public void draw(Graphics2D g2d) {
    
        g2d.setColor(trunkColor);
        Rectangle2D.Double trunk = new Rectangle2D.Double(x, y, w, h);
        g2d.fill(trunk);

        for (Circle leaf : leaves) {
            leaf.draw(g2d);
        }
    }
}



